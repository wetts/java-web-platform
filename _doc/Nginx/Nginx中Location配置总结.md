## location的匹配规则
语法规则： location [=|~|~*|^~] /uri/ { … }
```
已=开头表示精确匹配
^~ 开头表示uri以某个常规字符串开头，不是正则匹配
~ 开头表示区分大小写的正则匹配;
~* 开头表示不区分大小写的正则匹配
/ 通用匹配, 如果没有其它匹配,任何请求都会匹配到
```

顺序 no优先级：
(location =) > (location 完整路径) > (location ^~ 路径) > (location ~,~* 正则顺序) > (location 部分起始路径) > (/)

例子，有如下匹配规则：
```
location = / {
   #规则A
}
location = /login {
   #规则B
}
location ^~ /static/ {
   #规则C
}
location ~ \.(gif|jpg|png|js|css)$ {
   #规则D
}
location ~* \.png$ {
   #规则E
}
location !~ \.xhtml$ {
   #规则F
}
location !~* \.xhtml$ {
   #规则G
}
location / {
   #规则H
}

那么产生的效果如下：
访问根目录/， 比如http://localhost/ 将匹配规则A
访问 http://localhost/login 将匹配规则B，http://localhost/register 则匹配规则H
访问 http://localhost/static/a.html 将匹配规则C
访问 http://localhost/a.gif, http://localhost/b.jpg 将匹配规则D和规则E，但是规则D顺序优先，规则E不起作用，而 http://localhost/static/c.png 则优先匹配到规则C
访问 http://localhost/a.PNG 则匹配规则E，而不会匹配规则D，因为规则E不区分大小写。
访问 http://localhost/a.xhtml 不会匹配规则F和规则G，http://localhost/a.XHTML不会匹配规则G，因为不区分大小写。规则F，规则G属于排除法，符合匹配规则但是不会匹配到，所以想想看实际应用中哪里会用到。
访问 http://localhost/category/id/1111 则最终匹配到规则H，因为以上规则都不匹配，这个时候应该是nginx转发请求给后端应用服务器，比如FastCGI（php），tomcat（jsp），nginx作为方向代理服务器存在。
```

所以实际使用中，个人觉得至少有三个匹配规则定义，如下：
直接匹配网站根，通过域名访问网站首页比较频繁，使用这个会加速处理，官网如是说。
这里是直接转发给后端应用服务器了，也可以是一个静态首页

1. 第一个必选规则
location = / {
    proxy_pass http://tomcat:8080/index
}

2. 第二个必选规则是处理静态文件请求，这是nginx作为http服务器的强项
有两种配置模式，目录匹配或后缀匹配,任选其一或搭配使用
location ^~ /static/ {
    root /webroot/static/;
}
location ~* \.(gif|jpg|jpeg|png|css|js|ico)$ {
    root /webroot/res/;
}

3. 第三个规则就是通用规则，用来转发动态请求到后端应用服务器
非静态文件请求就默认是动态请求，自己根据实际把握
毕竟目前的一些框架的流行，带.php,.jsp后缀的情况很少了
location / {
    proxy_pass http://tomcat:8080/
}

## 例子
1. 防盗链
```
location ~* \.(gif|jpg|png|swf|flv)$ { 
  valid_referers none blocked www.jzxue.com jzxue.com ; 
  if ($invalid_referer) { 
    rewrite ^/ http://www.jzxue.com/retrun.html; 
    #return 403; 
  } 
} 

第一行：gif|jpg|png|swf|flv 
表示对gif、jpg、png、swf、flv后缀的文件实行防盗链 
第二行： 表示对www.ingnix.com这2个来路进行判断 
if{}里面内容的意思是，如果来路不是指定来思是，如果来路不是指定来路就跳转到http://www.jzxue.com/retrun.html页面，当然直接返回403也是可以的。
```

2. 根据文件类型设置过期时间
```
location ~* \.(js|css|jpg|jpeg|gif|png|swf)$ {
if (-f $request_filename) {
expires 1h;
break;
}
}
```

3. 禁止访问某个目录
```
location ^~ /path {
deny all;
}

可以把path换成实际需要的目录，目录path后是否带有"/",带"/"只禁止访问目录，不带"/"禁止访问目录中的文件
```
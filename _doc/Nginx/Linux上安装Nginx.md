#### 1> 查看nginx相关信息
```
yum list | grep nginx
```

#### 2> 发现版本很低，于是追加 nginx 的 yum 仓库，创建一个文件 /etc/yum.repos.d/nginx.repo，并将下面的内容复制进去
```
[nginx]  
name=nginx repo  
baseurl=http://nginx.org/packages/centos/$releasever/$basearch/  
gpgcheck=0  
enabled=1
```

#### 3> 
```
yum install nginx -y 
```
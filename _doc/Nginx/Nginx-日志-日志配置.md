## 访问日志
能够使用access_log指令的字段包括：http、server、location。

需要注意的是：Nginx进程设置的用户和组必须对日志路径有创建文件的权限，否则，会报错。
### 访问日志格式配置
log_format用来设置日志格式，也就是日志文件中每条日志的格式，具体如下：

```log_format name(格式名称) type(格式样式)```

举例说明如下：
```
log_format  main  '$server_name $remote_addr - $remote_user [$time_local] "$request" '
                '$status $uptream_status $body_bytes_sent "$http_referer" '
                '"$http_user_agent" "$http_x_forwarded_for" '
                '$ssl_protocol $ssl_cipher $upstream_addr $request_time $upstream_response_time';


$server_name：虚拟主机名称。
$remote_addr：远程客户端的IP地址。
-：空白，用一个“-”占位符替代，历史原因导致还存在。
$remote_user：远程客户端用户名称，用于记录浏览者进行身份验证时提供的名字，如登录百度的用户名scq2099yt，如果没有登录就是空白。
[$time_local]：访问的时间与时区，比如18/Jul/2012:17:00:01 +0800，时间信息最后的"+0800"表示服务器所处时区位于UTC之后的8小时。
$request：请求的URI和HTTP协议，这是整个PV日志记录中最有用的信息，记录服务器收到一个什么样的请求
$status：记录请求返回的http状态码，比如成功是200。
$uptream_status：upstream状态，比如成功是200.
$body_bytes_sent：发送给客户端的文件主体内容的大小，比如899，可以将日志每条记录中的这个值累加起来以粗略估计服务器吞吐量。
$http_referer：记录从哪个页面链接访问过来的。 
$http_user_agent：客户端浏览器信息
$http_x_forwarded_for：客户端的真实ip，通常web服务器放在反向代理的后面，这样就不能获取到客户的IP地址了，通过$remote_add拿到的IP地址是反向代理服务器的iP地址。反向代理服务器在转发请求的http头信息中，可以增加x_forwarded_for信息，用以记录原有客户端的IP地址和原来客户端的请求的服务器地址。
$ssl_protocol：SSL协议版本，比如TLSv1。
$ssl_cipher：交换数据中的算法，比如RC4-SHA。 
$upstream_addr：upstream的地址，即真正提供服务的主机地址。 
$request_time：整个请求的总时间。 
$upstream_response_time：请求过程中，upstream的响应时间。
```

### 访问日志路径配置
access_log指令用来指定日志文件的存放路径（包含日志文件名）、格式和缓存大小，具体如下：

```access_log path(存放路径) [format(自定义日志格式名称) [buffer=size | off]]```

举例说明如下：
```
access_log  logs/access.log  main;
```

### 关闭某个日志
```
location = /favicon.ico {  
  access_log off;  
} 
```

## 错误日志
错误日志主要记录客户端访问Nginx出错时的日志，格式不支持自定义。通过错误日志，你可以得到系统某个服务或server的性能瓶颈等。因此，将日志好好利用，你可以得到很多有价值的信息。错误日志由指令error_log来指定，具体格式如下：

```error_log path(存放路径) level(日志等级)```

path含义同access_log，level表示日志等级，具体如下：

[ debug | info | notice | warn | error | crit ]

从左至右，日志详细程度逐级递减，即debug最详细，crit最少。

举例说明如下：
```
error_log  logs/error.log  info;
```

需要注意的是：error_log off并不能关闭错误日志，而是会将错误日志记录到一个文件名为off的文件中。

正确的关闭错误日志记录功能的方法如下：

```
error_log /dev/null;
```

上面表示将存储日志的路径设置为“垃圾桶”。
ngx_http_upstream_module模块 允许定义一组服务器。它们可以在指令proxy_pass、 fastcgi_pass和 memcached_pass中被引用到。

### 配置例子
```
upstream backend {
    server backend1.example.com       weight=5;
    server backend2.example.com:8080;
    server unix:/tmp/backend3;

    server backup1.example.com:8080   backup;
    server backup2.example.com:8080   backup;
}

server {
    location / {
        proxy_pass http://backend;
    }
}
```

### 指令
```
语法:	upstream name { ... }
默认值:	—
上下文:	http
```

定义一组服务器。 这些服务器可以监听不同的端口。 而且，监听在TCP和UNIX域套接字的服务器可以混用。

例子：
```
upstream backend {
    server backend1.example.com weight=5;
    server 127.0.0.1:8080       max_fails=3 fail_timeout=30s;
    server unix:/tmp/backend3;
}
```

默认情况下，nginx按加权轮转的方式将请求分发到各服务器。 在上面的例子中，每7个请求会通过以下方式分发： 5个请求分到backend1.example.com， 一个请求分到第二个服务器，一个请求分到第三个服务器。 与服务器通信的时候，如果出现错误，请求会被传给下一个服务器，直到所有可用的服务器都被尝试过。 如果所有服务器都返回失败，客户端将会得到最后通信的那个服务器的（失败）响应结果。

---

```
语法:	server address [parameters];
默认值:	—
上下文:	upstream
```

定义服务器的地址address和其他参数parameters。 地址可以是域名或者IP地址，端口是可选的，或者是指定“unix:”前缀的UNIX域套接字的路径。如果没有指定端口，就使用80端口。 如果一个域名解析到多个IP，本质上是定义了多个server。

你可以定义下面的参数：

- weight=number 
    设定服务器的权重，默认是1。
- max_fails=number 
    设定Nginx与服务器通信的尝试失败的次数。在fail_timeout参数定义的时间段内，如果失败的次数达到此值，Nginx就认为服务器不可用。在下一个fail_timeout时间段，服务器不会再被尝试。 失败的尝试次数默认是1。设为0就会停止统计尝试次数，认为服务器是一直可用的。 你可以通过指令proxy_next_upstream、 fastcgi_next_upstream和 memcached_next_upstream来配置什么是失败的尝试。 默认配置时，http_404状态不被认为是失败的尝试。
- fail_timeout=time
    统计失败尝试次数的时间段。在这段时间中，服务器失败次数达到指定的尝试次数，服务器就被认为不可用。
    服务器被认为不可用的时间段。
    默认情况下，该超时时间是10秒。
- backup
    标记为备用服务器。当主服务器不可用以后，请求会被传给这些服务器。
- down
    标记服务器永久不可用，可以跟ip_hash指令一起使用。
    
例子：
```
upstream backend {
    server backend1.example.com     weight=5;
    server 127.0.0.1:8080           max_fails=3 fail_timeout=30s;
    server unix:/tmp/backend3;

    server backup1.example.com:8080 backup;
}
```

---

```
语法:	ip_hash;
默认值:	—
上下文:	upstream
```

指定服务器组的负载均衡方法，请求基于客户端的IP地址在服务器间进行分发。 IPv4地址的前三个字节或者IPv6的整个地址，会被用来作为一个散列key。 这种方法可以确保从同一个客户端过来的请求，会被传给同一台服务器。除了当服务器被认为不可用的时候，这些客户端的请求会被传给其他服务器，而且很有可能也是同一台服务器。

```从1.3.2和1.2.2版本开始支持IPv6地址。```

如果其中一个服务器想暂时移除，应该加上down参数。这样可以保留当前客户端IP地址散列分布。

例子：
```
upstream backend {
    ip_hash;

    server backend1.example.com;
    server backend2.example.com;
    server backend3.example.com down;
    server backend4.example.com;
}
```

---

```
语法:	keepalive connections;
默认值:	—
上下文:	upstream
这个指令出现在版本 1.1.4.
```

激活对上游服务器的连接进行缓存。

connections参数设置每个worker进程与后端服务器保持连接的最大数量。这些保持的连接会被放入缓存。 如果连接数大于这个值时，最久未使用的连接会被关闭。

```需要注意的是，keepalive指令不会限制Nginx进程与上游服务器的连接总数。 新的连接总会按需被创建。 connections参数应该稍微设低一点，以便上游服务器也能处理额外新进来的连接。```

配置memcached上游服务器连接keepalive的例子：
```
upstream memcached_backend {
    server 127.0.0.1:11211;
    server 10.0.0.2:11211;

    keepalive 32;
}

server {
    ...

    location /memcached/ {
        set $memcached_key $uri;
        memcached_pass memcached_backend;
    }

}
```

对于HTTP代理，proxy_http_version指令应该设置为“1.1”，同时“Connection”头的值也应被清空。
```
upstream http_backend {
    server 127.0.0.1:8080;

    keepalive 16;
}

server {
    ...

    location /http/ {
        proxy_pass http://http_backend;
        proxy_http_version 1.1;
        proxy_set_header Connection "";
        ...
    }
}
```

```另外一种选择是，HTTP/1.0协议的持久连接也可以通过发送“Connection: Keep-Alive”头来实现。不过不建议这样用。```

对于FastCGI的服务器，需要设置 fastcgi_keep_conn 指令来让连接keepalive工作：
```
upstream fastcgi_backend {
    server 127.0.0.1:9000;

    keepalive 8;
}

server {
    ...

    location /fastcgi/ {
        fastcgi_pass fastcgi_backend;
        fastcgi_keep_conn on;
        ...
    }
}
```

当使用的负载均衡方法不是默认的轮转法时，必须在keepalive 指令之前配置。

针对SCGI和uwsgi协议，还没有实现其keepalive连接的打算。

---
```
语法:	least_conn;
默认值:	—
上下文:	upstream
这个指令出现在版本 1.3.1 和 1.2.2.
```

指定服务器组的负载均衡方法，根据其权重值，将请求发送到活跃连接数最少的那台服务器。 如果这样的服务器有多台，那就采取有权重的轮转法进行尝试。
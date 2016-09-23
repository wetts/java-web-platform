使用limit_req_zone和limit_req指令配合使用来达到限制。一旦并发连接超过指定数量，就会返回503错误。 

````
http{
    ...

    #定义一个名为allips的limit_req_zone用来存储session，大小是10M内存，
    #以$binary_remote_addr 为key,限制平均每秒的请求为20个，
    #1M能存储16000个状态，rete的值必须为整数，
    #如果限制两秒钟一个请求，可以设置成30r/m

    limit_req_zone $binary_remote_addr zone=allips:10m rate=20r/s;
    ...
    server{
        ...
        location {
            ...

            #限制每ip每秒不超过20个请求，漏桶数burst为5
            #brust的意思就是，如果第1秒、2,3,4秒请求为19个，
            #第5秒的请求为25个是被允许的。
            #但是如果你第1秒就25个请求，第2秒超过20的请求返回503错误。
            #nodelay，如果不设置该选项，严格使用平均速率限制请求数，
            #第1秒25个请求时，5个请求放到第2秒执行，
            #设置nodelay，25个请求将在第1秒执行。

            limit_req zone=allips burst=5 nodelay;
            ...
        }
        ...
    }
    ...
}
```
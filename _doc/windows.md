### 1. 查看端口占用
> netstat -aon|findstr "8080"
>> 得到端口8080的进程号
> tasklist|findstr "4060"
>> 得到进程映像名称

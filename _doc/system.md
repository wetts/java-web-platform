## Linux

### 1. 防火墙规则查看、添加、删除和修改
> 1. 查看<br>
> <code>iptables -nL --line-number</code>
>> <code>iptables -nvL –line-number</code><br><br>
>> -L查看当前表的所有规则，默认查看的是filter表，如果要查看NAT表，可以加上-t NAT参数。<br>
>> -n不对ip地址进行反查，加上这个参数显示速度会快很多。<br>
>> -v输出详细信息，包含通过该规则的数据包数量，总字节数及相应的网络接口。<br>
>> –line-number显示规则的序列号，这个参数在删除或修改规则时会用到。
> 2. 添加<br>
> 添加规则有两个参数：-A和-I。其中-A是添加到规则的末尾；-I可以插入到指定位置，没有指定位置的话默认插入到规则的首部。
>> 添加一条规则到尾部：<br>
>> <code>iptables -A INPUT -s 192.168.1.5 -j DROP</code><br>
>> 再插入一条规则到第三行，将行数直接写到规则链的后面：<br>
>> <code>iptables -I INPUT 3 -s 192.168.1.3 -j DROP</code>
> 3. 删除<br>
> 删除用-D参数<br>
>> <code>iptables -D INPUT -s 192.168.1.5 -j DROP</code><br>
>> 有时候要删除的规则太长，删除时要写一大串，既浪费时间又容易写错，这时我们可以先使用--line-number找出该条规则的行号，再通过行号删除规则。<br>
>> 删除第二行规则：<br>
>> <code>iptables -D INPUT 2</code>
> 4. 修改<br>
> 修改使用-R参数<br>
>> 将第三条规则改为ACCEPT：<br>
>> <code>iptables -R INPUT 3 -j ACCEPT</code><br>

### 2. 和本地机器进行文件的交互
> sz：将选定的文件发送（send）到本地机器<br>
>> -y: 覆盖下载<br>
> rz：运行该命令会弹出一个文件选择窗口，从本地选择文件上传到服务器(receive)
>> -y: 覆盖上传<br>
>> -b: 以二进制方式，默认为文本方式<br>
>> -e: 对所有控制字符转义

### 3. 切换用户
> su: 用户切换的命令
>> su [user]切换到其他用户，但是不切换环境变量，su - [user]则是完整的切换到新的用户环境

---

## Windows

### 1. 查看端口占用
> netstat -aon|findstr "8080"
>> 得到端口8080的进程号
> tasklist|findstr "4060"
>> 得到进程映像名称

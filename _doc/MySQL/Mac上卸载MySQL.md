从 Yosemite 开始，/etc/hostconfig 这个文件已经移除，所以 Yosemite 后的系统可以忽略下面的命令
[plain] view plain copy print?在CODE上查看代码片派生到我的代码片

```
sudo nano /etc/hostconfig
```

===========================================================================================
玩Mac玩疯了。。。

以下是终端执行代码，走你：
[plain] view plain copy print?在CODE上查看代码片派生到我的代码片
```
sudo rm -rf /usr/local/mysql
sudo rm -rf /usr/local/mysql*
sudo rm -rf /Library/StartupItems/MySQLCOM
sudo rm -rf /Library/PreferencePanes/My*
sudo nano /etc/hostconfig     (复制前面部分回车，然后删掉这一行: MYSQLCOM=-YES-，control+O回车保存，control+X退出编辑界面)
sudo rm -rf ~/Library/PreferencePanes/My*
sudo rm -rf /Library/Receipts/mysql*
sudo rm -rf /Library/Receipts/MySQL*
sudo rm -rf /var/db/receipts/com.mysql.*
```
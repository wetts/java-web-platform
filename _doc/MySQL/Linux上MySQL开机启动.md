### 1. 将mysql安装目录下 support-files目录下的mysql.server文件拷贝到/etc/init.d/目录下并改名为mysqld，并更改权限
```
chmod 775 /etc/init.d/mysqld
```

### 2. 设置开机启动
```
chkconfig mysqld on
```
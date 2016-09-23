# 慢查询日志
## 配置
#### 方法一：
1. 找到mysql的配置文件my.cnf
2. 在[mysqld]下方加入慢查询的配置语句
```
# log-slow-queries: 代表MYSQL慢查询的日志存储目录, 此目录文件一定要有写权限
log-slow-queries = /usr/local/mysql/mysql-slow.log
# long_query_time: 最长执行时间
long_query_time = 2
# log下来没有使用索引的query
log-queries-not-using-indexes
```
3. 重启MySQL（service mysqld restart）

#### 方法二：
1. 执行 ***set global log_slow_queries = on***;
> 慢日志默认放在MySQL目录下，记录执行时间超过2s的sql

## 日志分析
慢日志分析命令为 ***mysqldumpslow*** 
- 参数：
```
-s ORDER what to sort by (t, at, l, al, r, ar etc), ‘at’ is default  
是order的顺序，说明写的不够详细，俺用下来，包括看了代码，主要有c,t,l,r和ac,at,al,ar，分别是按照query次数，时间，lock的时间和返回的记录数来排序，前面加了a的时倒叙。
 
-t NUM just show the top n queries  
是top n的意思，即为返回前面多少条的数据。
 
-g PATTERN grep: only consider stmts that include this string 
后边可以写一个正则匹配模式，大小写不敏感的。
```
- 例子：
```
# 访问次数最多的20个sql语句
mysqldumpslow -s c -t 20 host-slow.log  

# 记录集最多的20个sql
mysqldumpslow -s r -t 20 host-slow.log 

# 前10条里面含有左连接的sql语句
mysqldumpslow -t 10 -s t -g “left join” host-slow.log 
```
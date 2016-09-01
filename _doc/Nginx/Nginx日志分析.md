## 日志
### 分析
分析工具为 ***goaccess-nginx*** 

目前，我们可以通过这款软件查看的统计信息有：
- 统计概况，流量消耗等
- 访客排名
- 动态Web请求
- 静态web请求，如图片、样式表、脚本等。
- 来路域名
- 404 错误
- 操作系统
- 浏览器和搜索引擎
- 主机、DNS和ip地址
- HTTP 响应代码
- 引荐网站
- 键盘布局
- 自定义显示
- 支持超大日志（分析速度很快）

1. 语法
```
goaccess [ -b ][ -s ][ -e IP_ADDRESS][ -a ] <-f log_file >
```
- 参数
```
-f – 日志文件名
-b – 开启流量统计，如果希望加快分析速度不建议使用该参数
-s – 开启HTTP响应代码统计
-a – 开启用户代理统计
-e – 开启指定IP地址统计，默认禁用
```
- 例子
```
goaccess -f access.log

# 参数以显示HTTP响应代码、用户代理、流量消耗
goaccess -f access.log -s -a -b

zcat access.log.1.gz | goaccess

# 分析目前下所有日志
zcat access.log* | goaccess

# 10月5号那天的日志
sed -n ‘/05/Dec/2010/,$ p’ access.log | goaccess -s -b

# 分析从11月5号到12月5号一个月内的日志
sed -n ‘/5/Nov/2010/,/5/Dec/2010/ p’ access.log | goaccess -s -b

# 通过调用本地的goaccess程序来分析服务器上的日志
ssh user@server 'cat /var/log/apache2/access.log' | goaccess -s -a -b
```
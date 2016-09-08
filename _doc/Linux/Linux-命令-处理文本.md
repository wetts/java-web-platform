按日期查找时间段的nginx日志
```
sed -n "/14\/Jul\/2015:00:00:00/,/15\/Jul\/2015:15:00:00/"p access.log > time_access.log
```

查找504错误的页面和数量的nginx日志
``` 
awk '($9 ~ /504/)' time_access.log | awk '{print $7}' | sort | uniq -c | sort -rn > 504.log
```

查找访问最多的20个IP及访问次数的nginx日志
```
awk '{print $1}' time_access.log | sort | uniq -c | sort -n -k 1 -r | head -n 20 > top.log
```
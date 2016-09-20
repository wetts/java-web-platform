## 先按某字段分组再取每组中前 N 条记录
```
SELECT show_date,photo_url,video_url FROM tb_grouth_album a
    WHERE
        baby_uuid = '69182ed4acf9491cb5b6767e157626fa' AND
        (
            SELECT COUNT(id)
                FROM tb_grouth_album b
            WHERE
                baby_uuid = '69182ed4acf9491cb5b6767e157626fa' AND b.show_date = a.show_date AND a.id<=b.id
         ) <= 9
    ORDER BY show_date DESC
```

## 取日期字段的年月日
SELECT DATE_FORMAT(crt_time,'%Y-%m-%d') FROM ad_n_advertise_t
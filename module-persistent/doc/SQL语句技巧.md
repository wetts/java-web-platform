# 先按某字段分组再取每组中前 N 条记录
## MySQL
```
SELECT show_date,photo_url,video_url FROM tb_grouth_album a
    WHERE
        baby_uuid = '69182ed4acf9491cb5b6767e157626fa' AND
        (
            SELECT COUNT(id)
                FROM tb_grouth_album b
            WHERE
                b.show_date = a.show_date AND a.id<=b.id
         ) <= 9
    ORDER BY show_date DESC
```
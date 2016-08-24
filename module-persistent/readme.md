# Add Redis to Mybatis
1. add in the pom.xml the following dependency:
```
<dependencies>
  ...
  <dependency>
    <groupId>org.mybatis.caches</groupId>
    <artifactId>mybatis-redis</artifactId>
    <version>1.0.0-beta2</version>
  </dependency>
  ...
</dependencies>
```
2. configure it in the mapper XML
```
<mapper namespace="org.acme.FooMapper">
  <cache type="org.mybatis.caches.redis.RedisCache" />
  ...
</mapper>
```

---

# 动态数据源路由使用
@DataSourcePolicy 指定切换规则
> DataSourceSelectPolicy
>> 1. DataSourceSelectPolicy.AUTO 自动选择
>> 2. DataSourceSelectPolicy.MANUAL 手动选择

> Type 数据库自动选择类型（DataSourceSelectPolicy 设置为 AUTO 生效）

---

# druid 监控
```
<!-- druid监控 -->
    <servlet>
        <servlet-name>DruidStatView</servlet-name>
        <servlet-class>com.alibaba.druid.support.http.StatViewServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>DruidStatView</servlet-name>
        <url-pattern>/system/druid/*</url-pattern>
    </servlet-mapping>
    <!-- druid WebStatFilter用于采集web-jdbc关联监控的数据。 -->
    <filter>
        <filter-name>DruidWebStatFilter</filter-name>
        <filter-class>com.alibaba.druid.support.http.WebStatFilter</filter-class>
        <init-param>
            <param-name>exclusions</param-name>
            <param-value>*.js,*.gif,*.jpg,*.png,*.css,*.ico,/admin/druid/**</param-value>
        </init-param>
        <!--sessionStatEnable false时，关闭session统计-->
        <init-param>
            <param-name>sessionStatEnable</param-name>
            <param-value>true</param-value>
        </init-param>
        <init-param>
            <param-name>principalSessionName</param-name>
            <param-value>username</param-value>
        </init-param>
    </filter>
    <filter-mapping>
        <filter-name>DruidWebStatFilter</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```
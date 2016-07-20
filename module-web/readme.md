### Add Redis to Mybatis
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
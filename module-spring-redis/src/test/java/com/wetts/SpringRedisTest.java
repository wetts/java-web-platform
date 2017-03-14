package com.wetts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wetts on 2017/3/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-context-redis.xml"})
public class SpringRedisTest {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private RedisCacheManager redisCacheManager;

    @Test
    public void redisTest() {
        System.out.println(redisTemplate);
        redisTemplate.opsForValue().set("test", "aaa");
        System.out.println(redisTemplate.opsForValue().get("test"));
        System.out.println(redisCacheManager);
    }
}

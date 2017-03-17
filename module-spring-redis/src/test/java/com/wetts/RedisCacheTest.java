package com.wetts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.cache.RedisCache;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wetts on 2017/3/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:test-spring-context-redis.xml"})
public class RedisCacheTest {

    @Autowired
    private RedisCache redisCache;

    @Test
    public void redisTest() {
        System.out.println(redisCache);
        redisCache.put("aaa", "bbb");
        System.out.println(redisCache.get("aaa").get());
    }
}

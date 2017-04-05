package com.wetts.shiro.cache;

import com.wetts.base.shiro.cache.redis.RedisCache;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wetts on 2017/3/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-context-shiro-cache.xml"})
public class RedisCacheTest {

    @Autowired
    private RedisCache redisCache;

    @Test
    public void redisClearTest() {
        System.out.println(redisCache);
        redisCache.put("aaa","bbb");
        System.out.println(redisCache.get("aaa"));
        redisCache.clear();
        System.out.println(redisCache.get("aaa"));

    }

    @Test
    public void redisTest() {
        redisCache.put("aaa","bbb");
        System.out.println(redisCache.size());
        System.out.println("-----------");
        System.out.println(redisCache.keys());
        System.out.println(redisCache.remove("aaa"));
        System.out.println("-----------");
        System.out.println(redisCache.size());
    }

}

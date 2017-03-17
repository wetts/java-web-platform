package com.wetts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collection;

/**
 * Created by wetts on 2017/3/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-context-ehCache.xml"})
public class SpringEhCacheTest {

    @Autowired
    private EhCacheCacheManager springEhCacheManager;

    @Test
    public void redisTest() {
        Collection collection = springEhCacheManager.getCacheNames();
        System.out.println(collection);

        System.out.println(springEhCacheManager.getCacheManager().getCache("test").get("aaa"));
    }
}

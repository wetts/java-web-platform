package com.wetts.base.shiro.cache.redis;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.util.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.*;

/**
 * Created by wetts on 2017/3/17.
 */
public class RedisCache<K, V> implements Cache<K, V> {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * The wrapped Jedis instance.
     */
    private RedisTemplate redisTemplate;

    /**
     * The Redis key prefix for the sessions
     */
    private String keyPrefix = "shiro_redis_session:";

    /**
     * Returns the Redis session keys
     * prefix.
     *
     * @return The prefix
     */
    public String getKeyPrefix() {
        return keyPrefix;
    }

    /**
     * Sets the Redis sessions key
     * prefix.
     *
     * @param keyPrefix The prefix
     */
    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    /**
     * 通过一个JedisManager实例构造RedisCache
     */
    public RedisCache(RedisTemplate redisTemplate) {
        if (redisTemplate == null) {
            throw new IllegalArgumentException("Cache argument cannot be null.");
        }
        this.redisTemplate = redisTemplate;
    }

    /**
     * Constructs a cache instance with the specified
     * Redis manager and using a custom key prefix.
     *
     * @param redisTemplate The cache manager instance
     * @param prefix        The Redis key prefix
     */
    public RedisCache(RedisTemplate redisTemplate,
                      String prefix) {

        this(redisTemplate);

        // set the prefix
        this.keyPrefix = prefix;
    }

    /**
     * 获得byte[]型的key
     *
     * @param key
     * @return
     */
    private String getStrKey(K key) {
        String preKey = this.keyPrefix + key;
        return preKey;
    }

    @Override
    public V get(K key) throws CacheException {
        logger.debug("根据key从Redis中获取对象 key [" + key + "]");
        try {
            if (key == null) {
                return null;
            } else {
                V value = (V) redisTemplate.opsForValue().get(getStrKey(key));
                return value;
            }
        } catch (Throwable t) {
            throw new CacheException(t);
        }

    }

    @Override
    public V put(K key, V value) throws CacheException {
        logger.debug("根据key从存储 key [" + key + "]");
        try {
            redisTemplate.opsForValue().set(getStrKey(key), value);
            return value;
        } catch (Throwable t) {
            throw new CacheException(t);
        }
    }

    @Override
    public V remove(K key) throws CacheException {
        logger.debug("从redis中删除 key [" + key + "]");
        try {
            V previous = get(key);
            redisTemplate.delete(getStrKey(key));
            return previous;
        } catch (Throwable t) {
            throw new CacheException(t);
        }
    }

    @Override
    public void clear() throws CacheException {
        logger.debug("从redis中删除所有元素");
        try {
            redisTemplate.execute(new RedisCallback() {
                public String doInRedis(RedisConnection connection) throws DataAccessException {
                    connection.flushDb();
                    return "ok";
                }
            });
        } catch (Throwable t) {
            throw new CacheException(t);
        }
    }

    @Override
    public int size() {
        try {
            Long longSize = (Long) redisTemplate.execute(new RedisCallback() {
                public Long doInRedis(RedisConnection connection) throws DataAccessException {
                    return connection.dbSize();
                }
            });
            return longSize.intValue();
        } catch (Throwable t) {
            throw new CacheException(t);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public Set<K> keys() {
        try {
            Set keys = redisTemplate.keys(this.keyPrefix + "*");
            if (CollectionUtils.isEmpty(keys)) {
                return Collections.emptySet();
            } else {
                return keys;
            }
        } catch (Throwable t) {
            throw new CacheException(t);
        }
    }

    @Override
    public Collection<V> values() {
        try {
            Set<byte[]> keys = redisTemplate.keys(this.keyPrefix + "*");
            if (!CollectionUtils.isEmpty(keys)) {
                List<V> values = new ArrayList<V>(keys.size());
                for (byte[] key : keys) {
                    @SuppressWarnings("unchecked")
                    V value = get((K) key);
                    if (value != null) {
                        values.add(value);
                    }
                }
                return Collections.unmodifiableList(values);
            } else {
                return Collections.emptyList();
            }
        } catch (Throwable t) {
            throw new CacheException(t);
        }
    }

}
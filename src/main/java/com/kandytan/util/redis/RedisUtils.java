package com.kandytan.util.redis;

import com.kandytan.util.pro.RedisPro;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author Kandy Tan
 * @since 1.0
 */
public class RedisUtils {

    private static JedisPool jedisPool = null;

    private static JedisPool createPool() {

        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        // 设置最大连接数为默认值的 5 倍
        poolConfig.setMaxTotal(Integer.parseInt(RedisPro.getMaxTotal()));
// 设置最大空闲连接数为默认值的 3 倍
        poolConfig.setMaxIdle(Integer.parseInt(RedisPro.getMaxIdle()));
// 设置最小空闲连接数为默认值的 2 倍
        poolConfig.setMinIdle(Integer.parseInt(RedisPro.getMinIdle()));
// 设置开启 jmx 功能
        poolConfig.setJmxEnabled(true);
// 设置连接池没有连接后客户端的最大等待时间 ( 单位为毫秒 )
        poolConfig.setMaxWaitMillis(Integer.parseInt(RedisPro.getMaxWaitMillis()));

        try {
            jedisPool = new JedisPool(poolConfig, RedisPro.getHost(), Integer.valueOf(RedisPro.getPort()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jedisPool;
    }

    private static Jedis getJedisInstance() {
        if (null == jedisPool) {
            synchronized (RedisUtils.class) {
                if (null == jedisPool) {
                    jedisPool = createPool();
                }
            }
        }
        return jedisPool.getResource();
    }

    public static void setKey(String key, String value) {
        getJedisInstance().set(key, value);
    }

    public static String getKey(String key) {
        return getJedisInstance().get(key);
    }


    public static void main(String[] args) {
        String key1 = "key1";
        RedisUtils.setKey(key1, "yes1");
        System.out.println(RedisUtils.getKey(key1));
//        String maxTotal = RedisPro.getMaxTotal();
//        String maxIdle = RedisPro.getMaxIdle();
//        System.out.println(maxIdle);
    }

}

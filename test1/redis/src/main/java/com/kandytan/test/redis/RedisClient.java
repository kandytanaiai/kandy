package com.kandytan.test.redis;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import redis.clients.jedis.Jedis;

public class RedisClient {

    public static void main(String[] args) {
        Jedis jedis = RedisUtil.getJedis();
        jedis.set("name", "老张");
        System.out.println(jedis.get("name"));
    }

}

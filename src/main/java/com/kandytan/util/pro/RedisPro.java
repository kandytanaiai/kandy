package com.kandytan.util.pro;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Kandy Tan
 * @since 1.0
 */
public class RedisPro {

    private static Properties p;

    static {
        p = ProUtils.getPro("pro/redis.properties");
    }

    public static String getMaxTotal() {
        return p.getProperty("maxTotal");
    }

    public static String getMaxIdle() {
        return p.getProperty("maxIdle");
    }

    public static String getMinIdle() {
        return p.getProperty("minIdle");
    }

    public static String getMaxWaitMillis() {
        return p.getProperty("maxWaitMillis");
    }

    public static String getHost() {
        return p.getProperty("host");
    }

    public static String getPort() {
        return p.getProperty("port");
    }

}

package com.kandytan.base.util;

/**
 * @author Kandy Tan
 * @since 1.0
 */
public class UUID {
    public static String getUUID() {
        return java.util.UUID.randomUUID().toString().replaceAll("-", "");
    }
}

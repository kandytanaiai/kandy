package com.kandytan.test.redis;

public class Test1 {
    public static void main(String[] args) {
        try {
            String yearPeriod = "202012";
            int year = Integer.parseInt(yearPeriod.substring(0, 4));
            int period = Integer.parseInt(yearPeriod.substring(4, 6));
            System.out.println(year);
            System.out.println(period);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

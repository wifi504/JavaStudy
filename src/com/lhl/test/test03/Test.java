package com.lhl.test.test03;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/04/15_17:23
 */
public class Test {
    public static void main(String[] args) {

        System.out.println("num = " + m1());
    }

    static int m1() {
        try {
            System.out.println("1");
            return 1;
        } catch (Exception e) {
            System.out.println("2");
            return 2;
        } finally {
            System.out.println("3");
            return 3;
        }
    }
}

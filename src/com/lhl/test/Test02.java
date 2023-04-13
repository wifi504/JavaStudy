package com.lhl.test;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/04/11_12:26
 */
public class Test02 {

    public static void main(String[] args) {

        // 零宽字符
        String str = "\u2060";

        String a = "hello";
        String b = "he" + str +"llo";

        System.out.println(a + "\n" + b);
        System.out.println(a.equals(b));
    }
}

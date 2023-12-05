package com.lhl.exercise.string_;

import java.util.Arrays;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/08/07_22:34
 */
public class StringTest {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1.length());

        int index = str1.indexOf("l");
        int index1 = str1.indexOf("el");
        System.out.println(index);
        System.out.println(index1);

        String name = "hello, 张三";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1, 5));

        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());

        String str3 = str1.concat(" world!");
        System.out.println(str3);
        System.out.println(str3.replace("l", "I"));

        String poem = "锄禾日当午，汗滴禾下土，谁知盘中餐，粒粒皆辛苦";
        String[] split = poem.split("，");
        System.out.println(Arrays.toString(split));

        String test = "abcdefg";
        char[] chs = test.toCharArray();
        System.out.println(Arrays.toString(chs));
    }
}
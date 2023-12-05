package com.lhl.exercise.usefulClassEx;

import java.util.Locale;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/5_20:57
 */
public class Ex03 {
    /*
        输入一个人名，例如 Willian Jefferson Clinton ，然后以 Clinton, Willian .J 格式打印
     */

    static void printName(String str) {
        if (str == null) {
            throw new RuntimeException("Name 不允许为空");
        }

        String[] s = str.split(" ");

        if (s.length != 3) {
            throw new RuntimeException("Name 格式不正确！");
        }
        System.out.printf("%s, %s .%c\n", s[2], s[0], s[1].toUpperCase().charAt(0));
    }

    public static void main(String[] args) {
        printName("Willian Jefferson Clinton");
        printName("Willian jefferson Clinton");
        printName("Willian JeffersonClinton");
    }
}

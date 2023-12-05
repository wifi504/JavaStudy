package com.lhl.exercise.usefulClassEx;

import java.util.Arrays;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/5_18:21
 */
public class Ex01 {
    // 翻转字符串中的指定部分

    public static String reverse(String str, int start, int end) {
        int len = str.length();
        if (start < 0 || end > len) {
            return "错误：范围越界！";
        }

        StringBuilder strBud = new StringBuilder(str);
        char[] temp = new char[end - start + 1];
        strBud.getChars(start - 1, end, temp, 0);
        int index = temp.length - 1;
        for (int i = start - 1; i < end; ++i) {
            strBud.setCharAt(i, temp[index]);
            index--;
        }
        return strBud.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("abcdef", 1, 3));
        System.out.println(reverse("汉字的顺序不影响阅读", 4, 5));
        System.out.println(reverse("你应该输错了范围", 1, 10));

    }
}

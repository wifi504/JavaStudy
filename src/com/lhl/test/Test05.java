package com.lhl.test;

import java.util.Arrays;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/8_12:48
 */
public class Test05 {
    public static void main(String[] args) {
        String a = "aaa";
        String b = a;
        b = "bbb";
        System.out.println(a.getClass());
        System.out.println(a);

        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr2[0] = 0;
        System.out.println(arr1.getClass());
        System.out.println(Arrays.toString(arr1));

    }
}

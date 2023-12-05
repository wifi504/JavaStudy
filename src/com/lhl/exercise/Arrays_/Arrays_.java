package com.lhl.exercise.Arrays_;

import java.util.Arrays;
import java.util.List;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/5_12:05
 */
public class Arrays_ {
    public static void main(String[] args) {
        int[] arr = {5, 86, 8, 3, 663, 45, 34, 22};

        // 打印数组
        System.out.println(Arrays.toString(arr));

        // 排序数组
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 有序数组二分查找
        int i = Arrays.binarySearch(arr, 34); // 找不到返回负数，值为它该在的索引
        System.out.println("34在索引为" + i + "处");

        // 数组拷贝
        int[] newArr = Arrays.copyOf(arr, 10); // 拷贝arr的10个数据进newArr
        System.out.println(Arrays.toString(newArr));

        // 数组填充
        Arrays.fill(newArr, 666);
        System.out.println(Arrays.toString(newArr));

        // 比较数组
        System.out.println(Arrays.equals(arr, newArr));

        // 转换集合
        List asList = Arrays.asList(arr);
        System.out.println(asList.getClass());
    }
}

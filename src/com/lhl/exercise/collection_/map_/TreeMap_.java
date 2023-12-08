package com.lhl.exercise.collection_.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/8_16:27
 */

@SuppressWarnings({"all"})
public class TreeMap_ {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String str1 = (String) o1;
                String str2 = (String) o2;
                int num1 = str1.charAt(str1.length() - 1) - '0';
                int num2 = str2.charAt(str1.length() - 1) - '0';
                return num1 - num2;
            }
        });
        treeMap.put("key1", "value1");
        treeMap.put("key3", "value3");
        treeMap.put("key2", "value2");
        treeMap.put("key5", "value5");
        treeMap.put("key4", "value4");
        treeMap.put("key6", "value4");
        treeMap.put("key2", "value4");

        System.out.println(treeMap);
    }
}

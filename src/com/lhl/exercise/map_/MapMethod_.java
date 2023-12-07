package com.lhl.exercise.map_;

import java.util.HashMap;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/7_17:50
 */
public class MapMethod_ {
    // Map 接口常用方法
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        // 添加元素
        hashMap.put("小明", new Book("", 100)); // T
        hashMap.put("小明", "小红"); // 替换
        hashMap.put("小强", "小刚"); // T
        hashMap.put("大强", "小刚"); // T
        hashMap.put("空", null); // T
        hashMap.put(null, "空"); // T
        hashMap.put("金凡", "雷军"); // T

        System.out.println(hashMap);

        // 删除元素
        hashMap.remove(null);
        System.out.println(hashMap);

        // 获取值
        Object val = hashMap.get("金凡");
        System.out.println(val);

        // 获取多少对元素
        System.out.println(hashMap.size());

        // 元素个数是否为零
        System.out.println(hashMap.isEmpty());

        // 查找元素
        System.out.println(hashMap.containsKey("小明"));

        // 清空
        hashMap.clear();
        System.out.println(hashMap);
    }
}

class Book {
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}

package com.lhl.exercise.collection_.set_;

import java.util.LinkedHashSet;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/7_16:26
 */

@SuppressWarnings({"all"})
public class LinkedHashSet_ {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new String("AA"));
        linkedHashSet.add(456);
        linkedHashSet.add(456);
        linkedHashSet.add(new Customer("刘", 1001));
        linkedHashSet.add(123);
        linkedHashSet.add("hello");

        // 1. LinkedHashSet 加入元素的顺序和取出元素的顺序是一致的
        System.out.println(linkedHashSet);

        // 2. LinkedHashSet 底层维护的是一个 LinkHashMap (是 HashMap 的子类)
        // 3. LinkedHashSet 底层结构是 数组+双向链表
        // 4. 第一次添加时，直接将 数组table 扩容到 16 ，存放的节点类型是 LinkedHashMap$Entry
    }
}

class Customer {
    private String name;
    private int no;

    public Customer(String name, int no) {
        this.name = name;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }
}
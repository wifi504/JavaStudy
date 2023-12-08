package com.lhl.exercise.collection_.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/8_16:00
 */

@SuppressWarnings({"all"})
public class TreeSet_ {
    public static void main(String[] args) {

        /*
            TreeSet
            1. 当使用无参构造器创建 TreeSet 时，仍然是无序的
            2. 使用 TreeSet 提供的一个构造器，可以传入一个比较器（匿名内部类）并指定排序规则
         */

//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                // 自定义以什么判定排序
                return ((String) o1).compareTo((String) o2);
            }
        });

        // 添加数据
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("mary");
        treeSet.add("test");
        treeSet.add("abc");
        treeSet.add("def");

        System.out.println(treeSet);
    }
}

package com.lhl.exercise.collection_.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/6_20:39
 */
public class SetMethod_ {

    @SuppressWarnings({"all"})
    // 以 hashSet 来举例演示

    /*
        Set 接口对象存放的顺序是无序的
        Set 接口对象不能存放重复元素
        Set 接口对象能得到大小，但是不能使用索引获取元素
     */

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add(null);
        set.add(null);
        set.add("mary");

        System.out.println("set=" + set);
        System.out.println(set.size());

        // 迭代器遍历
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }

        // 增强for遍历
        for (Object o : set) {
            System.out.println("o=" + o);
        }
    }
}

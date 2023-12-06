package com.lhl.exercise.collection_.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/6_16:29
 */
public class ListEx {
    /*
        添加10个以上的元素（比如String "hello"）
        在2号位置插入一个元素”TEST“
        获得第5个元素
        删除第6个元素
        修改第7个元素
        再使用迭代器遍历集合

        要求：使用List的实现类ArrayList完成
     */

    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("测试1");
        list.add("测试2");
        list.add("测试3");
        list.add("测试4");
        list.add("测试5");
        list.add("测试6");
        list.add("测试7");
        list.add("测试8");
        list.add("测试9");
        list.add("测试10");

        System.out.println(list);
        list.add(1, "TEST");
        System.out.println("第五个元素：" + list.get(4));
        System.out.println(list.remove(5));
        System.out.println(list);
        System.out.println(list.set(6, "修改"));
        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}

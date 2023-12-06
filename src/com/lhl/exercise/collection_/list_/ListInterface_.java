package com.lhl.exercise.collection_.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/6_16:11
 */
public class ListInterface_ {
    /*
        List 接口
     */

    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();

        // 1. List 集合类中元素有序，即添加和取出的顺序一致，且可重复
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("666");
        list.add("tom");
        System.out.println(list);

        // 2. List 集合的每个元素都有对应的顺序索引，可以索引取出
        System.out.println(list.get(2));

        // 3. List 有很多的实现接口，查看API文档
    }
}

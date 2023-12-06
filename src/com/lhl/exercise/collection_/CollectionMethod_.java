package com.lhl.exercise.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/6_15:15
 */

public class CollectionMethod_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();

        // add() 添加单个元素
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("list=" + list);

        // remove() 删除指定元素
        list.remove(0); // 按照索引删除
        list.remove(true); // 按照元素删除
        System.out.println("list=" + list);

        // contains() 查找元素是否存在
        System.out.println(list.contains("jack"));

        // size() 返回元素个数
        System.out.println(list.size());

        // isEmpty() 判断集合是否为空
        System.out.println(list.isEmpty());

        // clear() 清空集合
        list.clear();
        System.out.println(list);

        // addAll() 添加多个元素
        ArrayList arrayList = new ArrayList();
        arrayList.add("红楼梦");
        arrayList.add("三国演义");
        list.addAll(arrayList);
        System.out.println(list);

        // 查找多个元素是否存在
        System.out.println(list.containsAll(arrayList));;

        // removeAll() 删除多个元素
        list.add("聊斋志异");
        list.removeAll(arrayList);
        System.out.println(list);




    }
}
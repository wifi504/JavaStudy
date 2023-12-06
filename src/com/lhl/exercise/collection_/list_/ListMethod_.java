package com.lhl.exercise.collection_.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/6_16:17
 */
public class ListMethod_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        // -------- List 常用方法 --------

        List list = new ArrayList();
        list.add("jack");
        list.add("mary");
        System.out.println(list);

        // 在 index=1 处插入对象
        list.add(1, "insert");
        System.out.println(list);

        // 从指定索引处加入一个集合的元素
        List list1 = new ArrayList();
        list1.add("小米");
        list1.add("Vivo");
        list.addAll(1, list1);
        System.out.println(list);

        // 查找某对象在集合中出现的位置
        System.out.println(list.indexOf("小米")); // 首次出现的位置
        System.out.println(list.lastIndexOf("Vivo")); // 最后出现的位置

        // 移除指定元素，并将此元素返回
        System.out.println(list.remove(1)); // 索引移除
        System.out.println(list.remove("insert")); // 对象移除
        System.out.println(list);

        // 设置/替换 指定元素，并将此元素返回
        System.out.println(list.set(0, "first")); // 索引替换
        System.out.println(list);

        // 返回指定范围的子集合，前闭后开区间
        List newList = list.subList(0,2);
        System.out.println(newList);
    }
}

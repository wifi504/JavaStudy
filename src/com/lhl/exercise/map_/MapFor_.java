package com.lhl.exercise.map_;

import java.util.*;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/7_18:03
 */
public class MapFor_ {
    // Map 的遍历
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("小明", "小红");
        map.put("小强", "小刚");
        map.put("大强", "小刚");
        map.put("空", null);
        map.put(null, "空");
        map.put("金凡", "雷军");

        // 第一组：先取出所有的 key
        Set keySet = map.keySet();
        // (1) 增强for
        for (Object key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }
        // (2) 迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + ":" + map.get(key));
        }

        // 第二组：把所有 value 取出
        Collection values = map.values();
        // 这里可以使用所有 Collections 使用的遍历方式
        // (1) 增强for
        System.out.println("取出所有value（增强for）");
        for (Object value : values) {
            System.out.println(value);
        }
        // (2) 迭代器
        System.out.println("取出所有value（迭代器）");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println(value);
        }

        // 第三组：通过 EntrySet 获取 k-v
        Set entrySet = map.entrySet();
        // (1) 增强for
        System.out.println("EntrySet - 增强for");
        for (Object entry : entrySet) {
            // 将 entry 转成 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        // (2) 迭代器
        System.out.println("EntrySet - 迭代器");
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            System.out.println(next.getClass());
            Map.Entry entry = (Map.Entry) next;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}

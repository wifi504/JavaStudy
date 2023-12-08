package com.lhl.exercise.collection_.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/8_16:48
 */

@SuppressWarnings({"all"})
public class Collections_ {
    public static void main(String[] args) {
        // 创建 ArrayList
        List list = new ArrayList();
        list.add("tom");
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        System.out.println(list);

        // 反转 List 元素顺序
        System.out.println("----- 反转 List 元素顺序 ----");
        Collections.reverse(list);
        System.out.println(list);

        // 对 List 集合随机排序
        System.out.println("---- 对 List 集合随机排序 ----");
        for (int i = 0; i < 5; ++i) {
            Collections.shuffle(list);
            System.out.println(list);
        }

        // 自然排序
        System.out.println("---- 自然排序 ----");
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator() { // 可以指定比较器
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        System.out.println(list);

        // 指定范围交换
        System.out.println("---- 指定范围交换 ----");
        Collections.swap(list, 1, 3);
        System.out.println(list);

        // 根据自然顺序最大值返回最大元素
        System.out.println("---- 根据自然顺序最大值返回最大元素 ----");
        System.out.println(Collections.max(list));
        System.out.println(Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) { // 可以自定义怎么找这个”最大“
                return ((String) o1).length() - ((String) o2).length();
            }
        }));
        Collections.min(list); // 同理

        // 返回指定元素出现的次数
        System.out.println("---- 返回指定元素出现的次数 ----");
        System.out.println(Collections.frequency(list, "tom"));

        // 拷贝
        System.out.println("---- 拷贝 ----");
        List dest = new ArrayList();
        for (Object o : list) { // 初始化一个容量否则抛异常
            dest.add(null);
        }
        Collections.copy(dest, list);
        System.out.println(dest);

        // 替换
        System.out.println("---- 替换 ----");
        Collections.replaceAll(list, "tom", "汤姆");
        System.out.println(list);
    }
}

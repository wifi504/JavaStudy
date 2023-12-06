package com.lhl.exercise.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/6_15:46
 */
public class SuperFor_ {

    /*
        增强 for 循环，可以代替 iterator 迭代器，
        其本质是相同的，不过简化了

        只能用于遍历集合或数组

        for (元素类型 元素名 : 集合名或数组名) {
            访问元素...
        }

        快捷键为 .for
     */
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        System.out.println(col);

        // 使用增强for循环
        for (Object o : col) {
            System.out.println(o);
        }
    }
}
package com.lhl.exercise.collection_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/8_17:47
 */
public class Homework03 {
    /*
        按要求完成下列任务
        1)使用HashMap类实例化一个Map类型的对象m，
            键(String）和值(int)分别用于存储员工的姓名和工资，
            存入数据如下:jack—650元; tom—1200元;smith——2900元;
        2)将jack的工资更改为2600元
        3)为所有员工工资加薪100元;
        4)遍历集合中所有的员工
        5)遍历集合中所有的工资
     */
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("jack", 650);
        m.put("tom", 1200);
        m.put("smith", 2900);

        m.put("jack", 2600);

        System.out.println(m);

        Set set = m.keySet();
        for (Object o : set) {
            String key = (String) o;
            m.put(key, (int) m.get(key) + 100);
        }

        System.out.println(m);
    }
}

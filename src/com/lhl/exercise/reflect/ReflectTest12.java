package com.lhl.exercise.reflect;

import java.lang.reflect.Constructor;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_15:57
 */
public class ReflectTest12 {
    /*
     *  使用反射机制实例化对象
     * */
    public static void main(String[] args) throws Exception {
        // 传统方式
        Order order1 = new Order();
        System.out.println(order1);

        Order order2 = new Order("1213313131", 3650.5, "已完成");
        System.out.println(order2);

        // 通过反射机制
        Class clazz = Class.forName("com.lhl.exercise.reflect.Order");

        // 依赖无参构造实现的，不建议使用，newInstance方法在java9过时
        Object obj = clazz.newInstance();
        System.out.println(obj);

        // 获取无参构造
        Constructor defaultCon = clazz.getDeclaredConstructor();
        Object obj1 = defaultCon.newInstance();
        System.out.println(obj1);

        // 获取三个参数的构造方法
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, double.class, String.class);
        Object obj2 = declaredConstructor.newInstance("13132131355456", 888,"待支付");
        System.out.println(obj2);
    }
}

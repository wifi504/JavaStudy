package com.lhl.exercise.reflect;

import java.lang.reflect.Field;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_14:54
 */
public class ReflectTest07 {
    /*
     * 通过反射机制如何访问Field，如何给属性赋值，如何读取属性的值
     * */
    public static void main(String[] args) throws Exception {
        // 传统方式
        Customer customer = new Customer();
        customer.name = "张三"; // Set
        System.out.println(customer.name); // Get

        // 使用反射
        // 获取类
        Class aClass = Class.forName("com.lhl.exercise.reflect.Customer");
        // 获取对应的Field
        Field ageField = aClass.getDeclaredField("age");
        // 调用方法打破封装
        ageField.setAccessible(true);
        // 修改属性的值
        ageField.set(customer, 20);
        // 读取属性
        System.out.println(ageField.get(customer));
    }
}

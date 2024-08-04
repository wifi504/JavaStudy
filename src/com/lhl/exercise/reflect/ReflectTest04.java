package com.lhl.exercise.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_14:18
 */
public class ReflectTest04 {
    /*
     *  关于反射机制中的 java.lang.reflect.Field (代表的是一个类中的字段/属性)
     * */
    public static void main(String[] args) throws Exception{
        // 获取Vip类
        Class vipClass = Class.forName("com.lhl.exercise.reflect.Vip");

        System.out.println("-------- 获取 Vip类 的所有 public 属性/字段 --------");
        Field[] fields = vipClass.getFields();

        for (Field field : fields) {
            System.out.println(field.getName());
        }

        System.out.println("-------- 获取 Vip类 的所有属性/字段，包括私有的 --------");
        Field[] declaredFields = vipClass.getDeclaredFields();

        for (Field field : declaredFields) {
            // 属性名
            System.out.print(field.getName() + " | ");
            // 属性类型
            System.out.print(field.getType().getSimpleName() + " | ");
            // 属性修饰符
            System.out.print(Modifier.toString(field.getModifiers()) + "\n");
        }

    }
}

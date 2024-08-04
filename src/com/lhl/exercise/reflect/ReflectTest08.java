package com.lhl.exercise.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_15:09
 */
public class ReflectTest08 {
    public static void main(String[] args) throws Exception {
        // 获取类
        Class clazz = Class.forName("com.lhl.exercise.reflect.UserService");

        // 获取所有方法
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            // 修饰符
            System.out.print(Modifier.toString(method.getModifiers()) + " ");
            // 返回值类型
            System.out.print(method.getReturnType().getSimpleName() + " ");
            // 方法名
            System.out.print(method.getName() + " | ");
            // 形参列表
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.print(parameter.getType().getSimpleName() + " ");
                System.out.print(parameter.getName() + ", ");
            }
            System.out.println();
        }
    }
}

package com.lhl.exercise.reflect.generic02;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_17:10
 */
public class Test {
    public static void main(String[] args) {
        Class<Mouse> mouseClass = Mouse.class;
        // 获取接口上类泛型
        Type[] genericInterfaces = mouseClass.getGenericInterfaces();
        for (Type genericInterface : genericInterfaces) {
            if (genericInterface instanceof ParameterizedType) {
                // 使用了泛型
                ParameterizedType parameterizedType = (ParameterizedType) genericInterface;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument.getTypeName());
                }
            }
        }
    }
}

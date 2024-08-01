package com.lhl.exercise.reflect.generic03;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_17:26
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 获取这个类
        Class<User> userClass = User.class;
        // 获取属性上的泛型，需要先获取属性
        Field mapField = userClass.getDeclaredField("map");
        // 获取这个属性上的泛型
        Type genericType = mapField.getGenericType();
        if (genericType instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument.getTypeName());
            }
        }
    }
}

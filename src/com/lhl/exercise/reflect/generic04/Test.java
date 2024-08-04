package com.lhl.exercise.reflect.generic04;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_17:31
 */
public class Test {
    /*
     *  获取方法上的泛型信息
     * */
    public static void main(String[] args) throws Exception {
        // 获取类
        Class<MyClass> myClassClass = MyClass.class;
        // 获取方法
        Method method = myClassClass.getDeclaredMethod("m", List.class, List.class);
        // 获取方法参数上的泛型
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            // 如果这个参数使用了泛型
            if (genericParameterType instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) genericParameterType;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument.getTypeName());
                }
            }
        }
        // 获取方法返回值上的泛型
        Type genericReturnType = method.getGenericReturnType();
        if (genericReturnType instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument.getTypeName());
            }
        }
    }
}

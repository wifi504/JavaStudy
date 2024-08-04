package com.lhl.exercise.reflect.generic01;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_16:58
 */
public class Test {
    /*
     *  获取父类的泛型信息
     * */
    public static void main(String[] args) {
        // 获取类
        Class<Cat> catClass = Cat.class;

        // 获取父类泛型
        Type genericSuperclass = catClass.getGenericSuperclass();
        System.out.println(genericSuperclass instanceof ParameterizedType); // 参数化类型（泛型）
        System.out.println(genericSuperclass instanceof Class); // 子类没使用泛型就是Class

        // 如果父类使用了泛型
        if (genericSuperclass instanceof ParameterizedType) {
            // 转型为参数化类型
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            // 获取泛型数组
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            // 遍历泛型数组
            for (Type actualTypeArgument : actualTypeArguments) {
                // 获取泛型的具体类型名
                System.out.println(actualTypeArgument.getTypeName());
            }
        }
    }
}

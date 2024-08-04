package com.lhl.exercise.reflect.generic05;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_17:39
 */
public class Test {
    /*
     *  获取构造方法上的泛型
     * */
    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;
        Constructor<User> declaredConstructor = userClass.getDeclaredConstructor(Map.class);
        Type[] genericParameterTypes = declaredConstructor.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            if (genericParameterType instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) genericParameterType;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument.getTypeName());
                }
            }
        }
    }
}

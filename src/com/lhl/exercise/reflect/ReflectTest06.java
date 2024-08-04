package com.lhl.exercise.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_14:39
 */
public class ReflectTest06 {
    /*
     *  使用反射实现反编译类
     * */
    public static void main(String[] args) throws Exception {
        // 获取类
        Class stringClass = Class.forName("java.lang.String");

        // 字符串拼接
        StringBuilder sb = new StringBuilder();

        // 获取类修饰符
        sb.append(Modifier.toString(stringClass.getModifiers()))
                .append(" class ")
                .append(stringClass.getSimpleName())
                .append(" extends ")
                .append(stringClass.getSuperclass().getSimpleName());

        // 获取类实现接口
        Class[] interfaces = stringClass.getInterfaces();
        if (interfaces.length > 0) {
            sb.append(" implements ");
            for (int i = 0; i < interfaces.length; i++) {
                Class interfaceClass = interfaces[i];
                sb.append(interfaceClass.getSimpleName());
                if (i != interfaces.length - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append(" {\n");

        // 获取所有属性
        Field[] fields = stringClass.getDeclaredFields();
        for (Field field : fields) {
            sb.append("\t")
                    .append(Modifier.toString(field.getModifiers()))
                    .append(" ")
                    .append(field.getType().getSimpleName())
                    .append(" ")
                    .append(field.getName())
                    .append(";\n");
        }
        sb.append("}");

        // 打印sb
        System.out.println(sb);
    }
}

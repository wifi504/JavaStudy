package com.lhl.exercise.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_15:18
 */
public class ReflectTest09 {
    /*
     *  反射一个类的方法
     * */
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        Class stringClass = Class.forName("java.lang.String");

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

        // 获取所有方法
        Method[] methods = stringClass.getDeclaredMethods();
        for (Method method : methods) {
            sb.append("\t")
                    .append(Modifier.toString(method.getModifiers()))
                    .append(" ")
                    .append(method.getReturnType().getSimpleName())
                    .append(" ")
                    .append(method.getName())
                    .append("(");
            Parameter[] parameters = method.getParameters();
            for (int i = 0; i < parameters.length; i++) {
                Parameter parameter = parameters[i];
                sb.append(parameter.getType().getSimpleName())
                        .append(" ")
                        .append(parameter.getName());
                if (i != parameters.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append(") {...}\n");
        }

        sb.append("}");

        // 打印sb
        System.out.println(sb);
    }
}

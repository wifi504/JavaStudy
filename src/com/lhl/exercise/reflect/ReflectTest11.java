package com.lhl.exercise.reflect;

import java.lang.reflect.*;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_15:41
 */
public class ReflectTest11 {
    /*
     *  获取一个类的所有构造方法
     * */
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        Class clazz = Class.forName("com.lhl.exercise.reflect.Order");

        // 获取类修饰符
        sb.append(Modifier.toString(clazz.getModifiers()))
                .append(" class ")
                .append(clazz.getSimpleName())
                .append(" extends ")
                .append(clazz.getSuperclass().getSimpleName());

        // 获取类实现接口
        Class[] interfaces = clazz.getInterfaces();
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
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            sb.append("\t")
                    .append(Modifier.toString(field.getModifiers()))
                    .append(" ")
                    .append(field.getType().getSimpleName())
                    .append(" ")
                    .append(field.getName())
                    .append(";\n");
        }

        // 获取所有构造方法
        Constructor[] cons = clazz.getDeclaredConstructors();
        sb.append("\n");
        for (Constructor con : cons) {
            sb.append("\t")
                    .append(Modifier.toString(con.getModifiers()))
                    .append(" ")
                    .append(Class.forName(con.getName()).getSimpleName())
                    .append("(");
            Parameter[] parameters = con.getParameters();
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

        // 获取所有方法
        Method[] methods = clazz.getDeclaredMethods();
        sb.append("\n");
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

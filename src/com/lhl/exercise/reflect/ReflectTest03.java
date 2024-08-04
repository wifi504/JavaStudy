package com.lhl.exercise.reflect;

import java.util.ResourceBundle;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_14:14
 */
public class ReflectTest03 {
    /*
     *  读取属性配置文件，获取类名，通过反射机制实例化对象
     * */

    public static void main(String[] args) throws Exception {
        ResourceBundle bundle = ResourceBundle.getBundle("com.lhl.exercise.reflect.classInfo");
        String className = bundle.getString("className");
        Class aClass = Class.forName(className);
        aClass.newInstance();
        System.out.println(aClass);
    }
}

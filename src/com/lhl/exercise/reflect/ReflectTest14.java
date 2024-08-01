package com.lhl.exercise.reflect;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_16:33
 */
public class ReflectTest14 {
    /*
     *  获取Class对象的第四种方式
     * */
    public static void main(String[] args) throws Exception {
        // 获取类加载器对象，获取到的是系统类加载器/应用类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        //jdk.internal.loader.ClassLoaders$AppClassLoader@63947c6b
        System.out.println(systemClassLoader);

        // 加载类，但是只完成了前两步骤（不会初始化）
        Class<?> clazz = systemClassLoader.loadClass("com.lhl.exercise.reflect.User");

    }
}

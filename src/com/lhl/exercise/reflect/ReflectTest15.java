package com.lhl.exercise.reflect;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_16:40
 */
public class ReflectTest15 {
    /*
     *  虚拟机内部有三个不同的类加载器
     *      1. 启动类加载器：BootstrapClassLoader
     *          负责加载核心类库
     *      2. 平台类加载器：PlatformClassLoader
     *          负责加载拓展类库
     *      3. 应用类加载器：AppClassLoader
     *          负责加载classpath
     *
     *  类加载器也是可以自定义的，只要符合类加载器的规范即可，
     *  自定义的类加载器我们一般称为：用户类加载器
     * */
    public static void main(String[] args) {
        // 通过自定义的类获取的类加载器是：应用类加载器
        ClassLoader appClassLoader1 = ReflectTest15.class.getClassLoader();
        System.out.println("应用类加载器：" + appClassLoader1);

        // 获取应用类加载器
        ClassLoader appClassLoader2 = ClassLoader.getSystemClassLoader();
        System.out.println("应用类加载器：" + appClassLoader2);

        // 获取应用类加载器
        ClassLoader appClassLoader3 = Thread.currentThread().getContextClassLoader();
        System.out.println("应用类加载器：" + appClassLoader3);

        // 通过 getParent() 方法可以获取当前类加载器的父加载器
        System.out.println("平台类加载器：" + appClassLoader1.getParent());
        System.out.println("启动类加载器：" + appClassLoader1.getParent().getParent());
        // 启动类加载器负责加载JDK核心类库，这个类库名字是看不到的，直接输出为null

    }
}

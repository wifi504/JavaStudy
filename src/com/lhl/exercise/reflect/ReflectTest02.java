package com.lhl.exercise.reflect;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_11:06
 */
public class ReflectTest02 {
    /*
     *  获取到Class之后能干啥
     * */
    public static void main(String[] args) throws Exception {
        Class userClass = Class.forName("com.lhl.exercise.reflect.User");

        // 通过userClass实例化User类型对象
        // 底层实现是调用了User类的无参构造
        // 要使用这个方法实例化对象的话，必须保证这个类中是存在无参数构造方法的
        // 如果没有无参数构造方法则抛异常 java.lang.InstantiationException
        User user = (User) userClass.newInstance();

        System.out.println(user);

        User user1 = (User) userClass.newInstance();

        System.out.println(user1);
    }
}

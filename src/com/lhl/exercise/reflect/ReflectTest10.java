package com.lhl.exercise.reflect;

import java.lang.reflect.Method;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_15:32
 */
public class ReflectTest10 {
    /*
     *  反射机制调用方法
     * */
    public static void main(String[] args) throws Exception {
        // 传统方式调用方法
        UserService userService = new UserService();
        boolean logined = userService.login("admin", "123456");
        System.out.println(logined ? "登录成功" : "登陆失败");
        userService.logout();

        // 使用反射机制调用方法
        Class<?> clazz = Class.forName("com.lhl.exercise.reflect.UserService");
        Method loginMethod = clazz.getDeclaredMethod("login", String.class, String.class);
        Object invoked = loginMethod.invoke(userService, "admin", "123456");
        System.out.println(invoked);
    }
}

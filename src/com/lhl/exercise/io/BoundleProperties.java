package com.lhl.exercise.io;

import java.util.ResourceBundle;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/25_17:14
 */
public class BoundleProperties {
    /*
     *   使用 JDK 中提供的资源绑定器来绑定属性配置文件
     * */
    public static void main(String[] args) {
        // 获取资源绑定器对象
        ResourceBundle bundle = ResourceBundle.getBundle("com.lhl.exercise.io.test");

        for (String s : bundle.keySet()) {
            System.out.printf("key:%s\tvalue:%s\n", s, bundle.getString(s));
        }


    }
}

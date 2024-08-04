package com.lhl.exercise.annotation;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_10:36
 */

/*
 *  自定义注解
 * */
public @interface DatabaseInfo {
    /*
     *  定义属性
     *
     *  属性类型 属性名();
     * */
    String driver() default ""; // 加 default 指定默认值

    String url();

    String user();

    String password();
}

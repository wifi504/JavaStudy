package com.lhl.exercise.annotation;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_10:37
 */
public class AnnotationTest06 {

    /*
     *  如果注解中有属性，使用必须给属性赋值
     *  除非定义注解给属性指定了默认值
     *  如果注解属性名是 value ，在使用注解的时候属性名可以省略 @SuppressWarnings("xxx")
     *  如果属性类型是数组{} 但是要填的数组内容只有一个，可以省略大括号
     * */
    @DatabaseInfo(
            driver = "com.mysql.cj.jdbc.Driver",
            url = "jdbc:mysql://localhost:3306/powernode",
            user = "root",
            password = "123456")
    public void connDB() {
    }
}

package com.lhl.exercise.annotation;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_10:10
 */
public class AnnotationTest03 {
    /*
     *  JDK 内置注解：@SuppressWarnings
     *      1. 主要作用是抑制警告
     *      2. 该注解常见的属性值
     *          rawtypes: 抑制未使用泛型警告
     *          resource: 抑制未关闭资源警告
     *          deprecation: 抑制使用已过时资源警告
     *          all: 抑制所有警告
     * */
    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {
//        @SuppressWarnings("rawtypes")
        List list = new ArrayList();

//        @SuppressWarnings("resource")
        FileInputStream in = new FileInputStream("test");

//        @SuppressWarnings("deprecation")
        Myclass1 myclass1 = new Myclass1();
    }
}

package com.lhl.exercise.annotation.meta1;

import java.lang.annotation.Annotation;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_11:00
 */

@MyAnnotation // 这个注解可以保留到字节码中, 并且在运行时可以被反射
public class Test {
    public static void main(String[] args) {
        Class<Test> testClass = Test.class;
        Annotation annotation = testClass.getAnnotation(MyAnnotation.class);

        System.out.println(annotation); // 反射出的注解

    }

}

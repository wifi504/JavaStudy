package com.lhl.exercise.annotation.reflect;

import java.lang.annotation.Annotation;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_11:47
 */
public class Test {
    public static void main(String[] args) {
        Class<Myclass> myclassClass = Myclass.class;

        // 获取所有注解
        Annotation[] annotations = myclassClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        // 获取指定注解
        if (myclassClass.isAnnotationPresent(Annotation1.class)) {
            Annotation1 a1 = myclassClass.getAnnotation(Annotation1.class);
            System.out.println(a1.name());
            System.out.println(a1.age());
        }

        if (myclassClass.isAnnotationPresent(Annotation2.class)) {
            Annotation2 a2 = myclassClass.getAnnotation(Annotation2.class);
            System.out.println(a2.email());
            System.out.println(a2.price());
        }
    }
}

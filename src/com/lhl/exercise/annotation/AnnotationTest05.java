package com.lhl.exercise.annotation;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_10:30
 */
public class AnnotationTest05 {
    @MyAnnotation()
    private String name;

    @MyAnnotation
    public void doSone() {
    }

    public void doOther(@MyAnnotation String name, @MyAnnotation String password) {
    }

    public void doOther1(
            @MyAnnotation
            String name,
            @MyAnnotation
            String password) {
    }
}

package com.lhl.exercise.annotation.meta3;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_11:22
 */
public class Test {

    /*
     *  注解的继承
     * */
    public static void main(String[] args) {
        Class<Cat> catClass = Cat.class;
        MyAnnotation annotation = catClass.getAnnotation(MyAnnotation.class);
        System.out.println(annotation);
    }
}

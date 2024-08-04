package com.lhl.exercise.annotation;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_10:07
 */
public class AnnotationTest02 {
    /*
     *  JDK 内置注解：@Override
     *      1. 给编译器看的
     *      2. 注解标注实例方法，被标注的方法必须是重写父类的方法
     *      3. 这个注解就是在编译阶段进行方法检查的，检查这个方法是否重写了父类方法，否则报错
     * */

//    @Override 这里会报错，此注解只能用于实例方法
    public static int num = 100;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

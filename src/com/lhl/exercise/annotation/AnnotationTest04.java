package com.lhl.exercise.annotation;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_10:17
 */
public class AnnotationTest04 {
    /*
     *  JDK 内置注解：@FunctionalInterface
     *      1. 这个注解专门标注接口的
     *      2. 被标注的注解必须是一个函数式接口
     *          函数式接口：接口中抽象方法只有一个，默认方法和静态方法是可以有多个的
     *      3. 给编译器看的
     * */


}

@FunctionalInterface
interface Flyable {

    void fly();

//    void run();  抽象方法不能再有了

    default void run() {
        System.out.println("默认方法是可以的");
    }

    static void doSome() {
        System.out.println("静态方法也是可以的");
    }
}
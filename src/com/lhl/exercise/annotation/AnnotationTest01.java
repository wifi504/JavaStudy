package com.lhl.exercise.annotation;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_10:00
 */
public class AnnotationTest01 {

    /*
     *  JDK 内置注解：@Deprecated
     *      1. 被这个注解标注的元素已过时
     *      2. 这个注解是给编译器看的，编译器看到这个注解之后会有警告提示信息
     *      3. @Deprecated 可以标注到类、方法、属性……上
     * */
    public static void main(String[] args) {
        Myclass1 myclass1 = new Myclass1();
        System.out.println(myclass1.num);
        myclass1.doSome();
    }
}

@Deprecated
class Myclass1 {
    @Deprecated(since = "9", forRemoval = false)
    public int num = 100;

    @Deprecated
    public void doSome() {}
}
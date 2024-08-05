package com.lhl.exercise.lambda;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_11:56
 */
public class LambdaTest02 {
    /*
     *  Lambda表达式和匿名内部类的区别：
     *      所需类型不同：
     *          匿名内部类可以是抽象类，也可以是接口
     *          lambda表达式只能是接口
     *      使用限制不同：
     *          匿名内部类可以有多个抽象方法
     *          lambda表达式使用的接口有且只有一个抽象方法
     *      实现原理不同：
     *          匿名内部类在编译后会生成单独的.class文件
     *          lambda表达式不会生成
     * */

    public static void main(String[] args) {
        LambdaTest02.test(new Animal() {
            @Override
            public void run() {
                System.out.println("Animal run...");
            }
        });

        // 编译报错，因为只能是接口
        // LambdaTest02.test(() -> System.out.println("Animal run..."));

        LambdaTest02.doFlay(new Flayable() {
            @Override
            public void run() {
                System.out.println("run...");
            }

            @Override
            public void fly() {
                System.out.println("fly...");
            }
        });

        // 编译报错：接口中只能有一个抽象方法
        // LambdaTest02.doFlay(() -> System.out.println("..."));
    }

    public static void test(Animal a) {
        a.run();
    }

    public static void doFlay(Flayable f) {
        f.fly();
        f.run();
    }
}

abstract class Animal {
    public abstract void run();
}

interface Flayable {
    void run();

    void fly();
}
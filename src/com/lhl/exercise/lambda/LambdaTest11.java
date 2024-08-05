package com.lhl.exercise.lambda;

import java.util.function.Consumer;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_14:43
 */
public class LambdaTest11 {
    /*
     *  实例方法引用
     * */
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("消费型函数式接口");

        Consumer<String> consumer1 = (s) -> System.out.println(s);
        consumer1.accept("消费型函数式接口");

        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("消费型函数式接口");
    }
}

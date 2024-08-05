package com.lhl.exercise.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_15:18
 */
public class LambdaTest18 {
    /*
     *  使用集合提供的forEach方法结合lambda表达式
     * */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 6, 3, 4, 6, 7, 3, 2, 9);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        list.forEach(elt -> System.out.println(elt));

        list.forEach(System.out::println);
    }
}

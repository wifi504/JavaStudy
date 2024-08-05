package com.lhl.exercise.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_15:28
 */
public class LambdaTest21 {
    /*
     *  集合的removeIf方法结合lambda
     * */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");

        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "cc".equals(s);
            }
        });
        System.out.println(list);

        list.removeIf(s -> "aa".equals(s));
        System.out.println(list);

        list.removeIf("bb"::equals);
        System.out.println(list);
    }
}

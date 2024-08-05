package com.lhl.exercise.lambda;

import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_15:24
 */
public class LambdaTest20 {
    /*
     *  forEach 遍历 Map
     * */

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "jack");
        hashMap.put(2, "lucy");
        hashMap.put(3, "mary");
        hashMap.put(4, "tom");
        hashMap.put(5, "jerry");

        hashMap.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer + " = " + s);
            }
        });

        hashMap.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}

package com.lhl.exercise.lambda;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_14:16
 */
public class LambdaTest08 {
    /*
     *  有返回值一个参数
     * */

    public static void main(String[] args) {
        OneParameterHasReturn ophr = new OneParameterHasReturn() {
            @Override
            public Integer test(Integer value) {
                return value * 2;
            }
        };
        System.out.println(ophr.test(100));

        OneParameterHasReturn ophr2 = value -> value * 2;
        System.out.println(ophr2.test(200));
    }
}

@FunctionalInterface
interface OneParameterHasReturn {
    Integer test(Integer value);
}

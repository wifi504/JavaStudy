package com.lhl.exercise.lambda;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_14:18
 */
public class LambdaTest09 {
    /*
     *  有返回值多个参数
     * */

    public static void main(String[] args) {
        MoreParameterHasReturn mphr = new MoreParameterHasReturn() {
            @Override
            public Integer test(Integer value1, Integer value2) {
                return value1 + value2;
            }
        };
        System.out.println(mphr.test(1, 2));

        MoreParameterHasReturn mphr2 = (value1, value2) -> value1 + value2;
        System.out.println(mphr2.test(3, 4));
    }
}

@FunctionalInterface
interface MoreParameterHasReturn {
    Integer test(Integer value1, Integer value2);
}

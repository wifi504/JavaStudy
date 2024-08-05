package com.lhl.exercise.lambda;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_14:13
 */
public class LambdaTest07 {
    /*
     *  有返回值无参数
     * */
    public static void main(String[] args) {
        NoParameterHasReturn nphr = new NoParameterHasReturn() {
            @Override
            public Integer test() {
                return 300;
            }
        };
        System.out.println(nphr.test());

        NoParameterHasReturn nphr2 = () -> 500;
        System.out.println(nphr2.test());
    }
}

@FunctionalInterface
interface NoParameterHasReturn {
    Integer test();
}

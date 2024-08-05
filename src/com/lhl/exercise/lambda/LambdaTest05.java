package com.lhl.exercise.lambda;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_14:07
 */
public class LambdaTest05 {
    /*
     *  无返回值一个参数
     * */
    public static void main(String[] args) {
        OneParameterNoReturn opnr = new OneParameterNoReturn() {
            @Override
            public void test(Integer value) {
                System.out.println("Integer --> " + value);
            }
        };
        opnr.test(1000);

        OneParameterNoReturn opnr2 = value -> System.out.println("Integer --> " + value);
        opnr2.test(2000);
    }
}

@FunctionalInterface
interface OneParameterNoReturn {
    void test(Integer value);
}

package com.lhl.exercise.lambda;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_14:10
 */
public class LambdaTest06 {
    /*
     *  无返回值多个参数
     * */
    public static void main(String[] args) {
        MoreParameterNoReturn mpnr = new MoreParameterNoReturn() {
            @Override
            public void test(Integer value1, Integer value2) {
                System.out.println(value1 + value2);
            }
        };
        mpnr.test(100, 200);

        MoreParameterNoReturn mpnr2 = (value1, value2) -> System.out.println(value1 + value2);
        mpnr2.test(300, 400);
    }

}

@FunctionalInterface
interface MoreParameterNoReturn {
    void test(Integer value1, Integer value2);
}

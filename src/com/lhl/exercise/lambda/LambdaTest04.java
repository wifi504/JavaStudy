package com.lhl.exercise.lambda;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_12:18
 */
public class LambdaTest04 {
    /*
     *  无返回值无参数的函数式接口
     * */
    public static void main(String[] args) {
        NoParameterNoReturn npnr = new NoParameterNoReturn() {
            @Override
            public void test() {
                System.out.println("无返回值无参数的test方法执行了");
            }
        };
        npnr.test();

        NoParameterNoReturn npnr2 = () -> System.out.println("test 执行了");
        npnr2.test();
    }
}

@FunctionalInterface
interface NoParameterNoReturn {
    void test();
}

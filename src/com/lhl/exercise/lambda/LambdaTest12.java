package com.lhl.exercise.lambda;

import java.util.function.Function;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_14:47
 */
public class LambdaTest12 {
    /*
     *  静态方法引用
     *  语法格式
     *      类名::静态方法名字;
     *  什么条件可以使用静态方法引用？
     *      函数式接口中的     返回值类型   和   形参
     *      与
     *      内部调用方法的     返回值类型   和   形参
     *      一致
     * */
    public static void main(String[] args) {
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(function.apply(3.14));

        Function<Double, Long> function1 = value -> Math.round(value);
        System.out.println(function1.apply(113.33));

        Function<Double, Long> function2 = Math::round;
        System.out.println(function2.apply(2.718));
    }
}

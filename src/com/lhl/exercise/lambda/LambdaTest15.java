package com.lhl.exercise.lambda;

import java.util.function.Supplier;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_15:06
 */
public class LambdaTest15 {
    /*
     *  构造方法引用
     *      语法格式
     *          类名::new;
     *      条件
     *          函数式接口中的方法的形参列表
     *          与
     *          构造方法上的形参列表
     *          一致
     *          并且返回值类型相同
     * */
    public static void main(String[] args) {
        // 使用生产型函数式接口
        Supplier<Bird> supplier = new Supplier<Bird>() {
            @Override
            public Bird get() {
                return new Bird();
            }
        };
        System.out.println(supplier.get());

        Supplier<Bird> supplier1 = () -> new Bird();
        System.out.println(supplier1.get());

        Supplier<Bird> supplier2 = Bird::new;
        System.out.println(supplier2.get());
    }
}

class Bird {
}

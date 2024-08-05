package com.lhl.exercise.lambda;

import java.util.Comparator;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_14:54
 */
public class LambdaTest13 {
    /*
     *  特殊方法引用
     *      语法格式
     *          类名::实例方法名字;
     *      条件
     *          1. 函数式接口中抽象方法的第一个参数作为内部方法调用对象
     *          2. 函数式接口中抽象方法的第二个参数开始与内部调用方法形参一致
     *          3. 函数式接口中抽象方法的返回值类型与内部方法的返回值类型一致
     * */

    public static void main(String[] args) {
        Comparator<Double> comparator = new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator.compare(3.14, 5.6));

        Comparator<Double> comparator1 = ((o1, o2) -> o1.compareTo(o2));
        System.out.println(comparator1.compare(3.14, 5.6));

        Comparator<Double> comparator2 = Double::compareTo;
        System.out.println(comparator2.compare(3.14, 5.6));
    }
}

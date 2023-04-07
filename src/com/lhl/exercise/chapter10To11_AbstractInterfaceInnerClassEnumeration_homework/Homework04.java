package com.lhl.exercise.chapter10To11_AbstractInterfaceInnerClassEnumeration_homework;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/04/07_16:46
 */
public class Homework04 {
    public static void main(String[] args) {
        new Cellphone().testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 10, 50);
    }

}

interface ICalculate {
    double work(double n1, double n2);
}

class Cellphone {
    void testWork(ICalculate I, double n1, double n2) {
        System.out.println("计算结果：" + I.work(n1, n2));
    }
}

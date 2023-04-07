package com.lhl.exercise.chapter10To11_AbstractInterfaceInnerClassEnumeration_homework;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/04/07_20:38
 */
public class Homework05 {
    public static void main(String[] args) {
        new A().f1();
    }
}

class A {
    private final String NAME = "A 类的 name";

    public void f1() {
        class B {
            private final String NAME = "局部内部类 B 的 name";

            private void show() {
                System.out.println(NAME);
                System.out.println(A.this.NAME);
            }
        }
        new B().show();
    }
}
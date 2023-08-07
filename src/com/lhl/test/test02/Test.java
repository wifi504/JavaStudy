package com.lhl.test.test02;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/04/14_13:45
 */
public class Test {
    public static void main(String[] args) {
        new B();
    }
}

class A {
    int n1;

    public A() {
        System.out.println("A 类的默认构造器被调用...");
    }
}

class B extends A {
    public B() {
        System.out.println("B 类的默认构造器被调用...");
    }
}

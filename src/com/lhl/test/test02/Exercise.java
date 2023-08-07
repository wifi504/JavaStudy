package com.lhl.test.test02;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/04/14_14:03
 */
public class Exercise {
    public static void main(String[] args) {
        new Son().m1();
        new Son("周博航").m1();
    }
}

class Father {
    String name = "罗明瑞";

    public Father() {
        System.out.println("Father的构造器");
    }

    public Father(String name) {
        this.name = name;
    }
}

class Son extends Father {
    String name = "赵子敬";

    public Son() {
        System.out.println("Son的构造器");
    }

    public Son(String s) {
        super(s);
    }

    public void m1() {
        System.out.println(name);
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
package com.lhl.oopExercise.override_.test01;

public class Test {

    public static void main(String[] args) {
        A test = new B();
        test.print();
    }
}

class A {
    public void print() {
        System.out.println("A 父类 打印");
    }
}

class B extends A {
    public void print() {
        System.out.println("B 子类 打印");
    }
}

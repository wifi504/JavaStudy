package com.lhl.exercise.chapter10To11_AbstractInterfaceInnerClassEnumeration_homework;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/04/07_16:42
 */
public class Homework03 {
    public static void main(String[] args) {
        new Cat().shout();
        new Dog().shout();
    }
}

abstract class Animal {
    abstract void shout();
}

class Cat extends Animal {
    @Override
    void shout() {
        System.out.println("小猫喵喵叫...");
    }
}

class Dog extends Animal {
    @Override
    void shout() {
        System.out.println("小狗汪汪叫...");
    }
}
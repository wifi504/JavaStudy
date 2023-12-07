package com.lhl.exercise.collection_.set_;

import java.util.HashSet;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/6_20:58
 */

@SuppressWarnings({"all"})
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        // 说明：
        // 1. 在执行 add() 方法后，会返回一个 boolean 值
        // 2. 如果对象添加成功，返回 true ，否则返回 false
        // 3. 可以通过 remove() 指定删除某个对象


        // 案例 1
        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("Rose"));
        set.remove("john");
        System.out.println("set=" + set);


        // 案例 2
        set = new HashSet();
        System.out.println("set=" + set);
        set.add("lucy"); // T
        set.add("lucy"); // F
        set.add(new Dog("tom")); // T
        set.add(new Dog("tom")); // T
        System.out.println("set=" + set);

        // 经典面试题~
        set.add(new String("hello")); // T
        set.add(new String("hello")); // F
        System.out.println("set=" + set);
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
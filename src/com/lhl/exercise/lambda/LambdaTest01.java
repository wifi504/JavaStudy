package com.lhl.exercise.lambda;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_11:39
 */
public class LambdaTest01 {
    public static void main(String[] args) {
        // TreeSet 集合排序

        // 方式1：比较规则固定不变，让TreeSet集合中的元素实现java.lang.Comparable接口
        // 方式2：给TreeSet集合传递一个比较器对象，比较器实现java.lang.Comparable接口

        // 匿名内部类实现
        TreeSet<User> users = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        // lambda表达式
        TreeSet<User> users1 = new TreeSet<>((User o1, User o2) -> {
            return o1.getAge() - o2.getAge();
        });

        TreeSet<User> users2 = new TreeSet<>((o1, o2) -> o1.getAge() - o2.getAge());
    }
}

class User {
    private int age;

    User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}
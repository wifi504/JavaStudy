package com.lhl.exercise.reflect;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_10:50
 */
public class User {
    private String name;
    private int age;

    static {
        System.out.println("User 类的静态代码块执行了！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
        System.out.println("User 类的无参构造执行了~");
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

package com.lhl.exercise.collection_.set_;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/7_14:54
 */
public class HashSetEx01 {
    /*
        练习1
        定义一个 Employee 类，该类包含：private 成员属性 name, age
        要求：
        1. 创建 3 个 Employee 对象放入 HashSet 中
        2. 当 name 和 age 的值相同时，认为是相同员工，不能添加到 HashSet 集合中
     */

    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Employee person1 = new Employee("张三", 20);
        Employee person2 = new Employee("李四", 23);
        Employee person3 = new Employee("王五", 24);
        Employee person4 = new Employee("张三", 20);

        HashSet hashSet = new HashSet();
        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);
        hashSet.add(person4);

        System.out.println(hashSet);

    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 如果 name 和 age 值相同，返回相同 hash 值

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
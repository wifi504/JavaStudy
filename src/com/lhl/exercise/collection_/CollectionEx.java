package com.lhl.exercise.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/6_15:54
 */
public class CollectionEx {
    /*
        创建 3 个 Dog {name, age} 对象，放入 ArrayList 中
        赋给 List 引用

        用迭代器和增强for循环两种方式遍历
        重写 Dog 的 toString() ，输出 name 和 age
     */

    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(new Dog("张三", 10));
        list.add(new Dog("李四", 15));
        list.add(new Dog("王五", 8));

        System.out.println(list);

        // 迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }

        // 增强for遍历
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

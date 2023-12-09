package com.lhl.exercise.collection_;

import java.util.ArrayList;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/8_17:33
 */
public class Homework02 {
    /*
        使用ArrayList 完成对对象Car {name, price}的各种操作
        1.add:添加单个元系
        2.remove:删除指定元素
        3.contains:查找元素是否存在
        4.size:获取元素个数
        5.isEmpty:判断是否为空
        6.clear:清空
        7.addAll:添加多个元素
        8.containsAll:查找多个元素是否都存在
        9.removeAll:删除多个元素
        使用增强for和迭代器来遍历所有的car，需要重写Car 的toString方法

        Car car = new Car("宝马"，400000)
        Car car2 = new Car(宾利"，5000000);
     */

    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        Car car = new Car("宝马", 400000);
        Car car1 = new Car("宾利", 5000000);

        System.out.println(list);
        list.add(car);
        list.add(car1);
        list.remove(car);
        System.out.println(list);
        System.out.println(list.contains(car1));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        ArrayList list1 = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.addAll(list1);
        System.out.println(list);
        System.out.println(list.containsAll(list1));
        list.removeAll(list1);
        System.out.println(list);

    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
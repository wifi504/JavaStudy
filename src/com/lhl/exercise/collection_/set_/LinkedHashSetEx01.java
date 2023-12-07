package com.lhl.exercise.collection_.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/7_16:45
 */
public class LinkedHashSetEx01 {
    /*
        Car 类 (属性：name, price)，如果 name 和 price 一样
        则认为是相同元素，就不能添加
    */
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("摇摇车", 2500));
        linkedHashSet.add(new Car("摇摇车", 2800));
        linkedHashSet.add(new Car("摇摇车", 2500));
        linkedHashSet.add(new Car("碰碰车", 3200));

        System.out.println(linkedHashSet);
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

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return name.equals(car.name) && price == car.price;
    }
}
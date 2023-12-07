package com.lhl.exercise.collection_.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/7_15:10
 */
public class HashSetEx02 {
    /*
        练习2
        定义一个 Employee 类，该类包含：
        private 成员属性的 name, sal, birthday(MyDate类型，属性包括year, month, day)

        要求：
        1. 创建 3 个 Employee 放入 HashSet 中
        2. 当 name 和 birthday 的值相同时，认为是相同的员工，不能添加到 HashSet 集合中
     */

    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee1("张三", 3500, new MyDate(2000, 8, 6)));
        hashSet.add(new Employee1("李四", 4500, new MyDate(1998, 6, 15)));
        hashSet.add(new Employee1("王五", 6000, new MyDate(1995, 12, 26)));
        hashSet.add(new Employee1("王五", 6000, new MyDate(1995, 12, 26)));

        System.out.println(hashSet);
    }

}

class Employee1 {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee1(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return Objects.equals(name, employee1.name)
                && Objects.equals(birthday, employee1.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyDate e = (MyDate) obj;
        return year == e.getYear()
                && month == e.getMonth()
                && day == e.getDay();
    }
}

package com.lhl.exercise.generic_;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/10_21:23
 */
public class Exercise01 {
    /*
        泛型课堂练习题
        定义 Employee 类
        1) 该类包含: private成员变量 name,sal,birthday,
           其中 birthday 为 MyDate 类的对象;
        2) 为每一个属性定义 getter, setter 方法;
        3) 重写 toString 方法输出 name, sal, birthday
        4) MyDate类包含: private 成员变量 month, day, year;
           并为每一个属性定义 getter, setter 方法;
        5) 创建该类的3个对象，并把这些对象放入 ArrayList 集合中(ArrayList需使用泛型来定义)
           对集合中的元素进行排序,并遍历输出:
           排序方式: 调用ArrayList 的sort方法，传入Comparator对象[使用泛型]
                    先按照name排序，如果name相同，则按生日日期的先后排序。【即:定制排序】

     */
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("张三", 18000, new MyDate(2003, 1, 1)));
        employees.add(new Employee("李四", 28000, new MyDate(2001, 9, 16)));
        employees.add(new Employee("王五", 15000, new MyDate(2002, 8, 28)));
        employees.add(new Employee("王五", 15000, new MyDate(2002, 4, 28)));
        employees.add(new Employee("a", 15000, new MyDate(2002, 4, 28)));
        employees.add(new Employee("d", 15000, new MyDate(2002, 4, 28)));
        employees.add(new Employee("c", 15000, new MyDate(2002, 4, 28)));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName().equals(o2.getName())) {
                    MyDate d1 = o1.getBirthday();
                    MyDate d2 = o2.getBirthday();

                    if (d1.getYear() != d2.getYear()) {
                        return d1.getYear() - d2.getYear();
                    } else if (d1.getMonth() != d2.getMonth()) {
                        return d1.getMonth() - d2.getMonth();
                    } else {
                        return d1.getDay() - d2.getDay();
                    }
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
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
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
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
}
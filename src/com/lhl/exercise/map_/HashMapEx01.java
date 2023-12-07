package com.lhl.exercise.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/7_18:19
 */
public class HashMapEx01 {
    /*
        使用 hashMap 添加三个员工对象，要求：
        键：员工id
        值：员工对象

        并遍历显示工资 >18000 的员工（遍历方式至少两种）
        员工类：姓名、工资、员工id
     */

    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("10001", new Employee("张三", 20000, 10001));
        hashMap.put("10002", new Employee("李四", 40000, 10002));
        hashMap.put("10003", new Employee("王五", 10000, 10003));

        System.out.println(hashMap);

        // 增强for遍历
        Set keySet = hashMap.keySet();
        for (Object key : keySet) {
            if (((Employee) hashMap.get(key)).getSal() > 18000) {
                System.out.println(key + ": " + hashMap.get(key));
            }
        }

        System.out.println();

        // 迭代器遍历
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            if (((Employee) entry.getValue()).getSal() > 18000) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

class Employee {
    private String name;
    private double sal;
    private int id;

    public Employee(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
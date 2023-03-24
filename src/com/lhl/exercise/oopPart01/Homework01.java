package com.lhl.exercise.oopPart01;

public class Homework01 {

    public static void main(String[] args) {

        Person[] people = new Person[3];
        people[0] = new Person("张三", 40, "律师");
        people[1] = new Person("李四", 16, "高中生");
        people[2] = new Person("王五", 25, "大学生");

        // 冒泡排序
        for (int i = 0; i < people.length - 1; ++i) {
            for (int j = 0; j < people.length - 1 - i; ++j) {
                if (people[j].getAge() < people[j + 1].getAge()) {
                    Person temp;
                    temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }

        // 打印人员信息
        for (int i = 0; i < people.length; ++i) {
            System.out.println(people[i]);
        }
    }
}

class Person {

    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "姓名：" + getName() + " 年龄：" + getAge() + " 工作：" + getJob();
    }
}

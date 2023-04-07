package com.lhl.exercise.chapter10To11_AbstractInterfaceInnerClassEnumeration_homework;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/04/07_21:44
 */
public class Homework07 {
    public static void main(String[] args) {

        new Car(29).new Air().flow();
        new Car(80).new Air().flow();
        new Car(45).new Air().flow();
        new Car(-8).new Air().flow();
        new Car(0).new Air().flow();
        new Car(10).new Air().flow();
    }
}

class Car {

    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air {

        public void flow() {
            if (temperature < 0) {
                System.out.println("吹暖气...");
            } else if (temperature > 40) {
                System.out.println("吹冷气...");
            } else {
                System.out.println("不吹风");
            }
        }
    }
}
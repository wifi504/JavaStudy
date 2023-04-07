package com.lhl.exercise.chapter10To11_AbstractInterfaceInnerClassEnumeration_homework;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/04/07_16:29
 */
public class Homework02 {
    public static void main(String[] args) {

        // 调用两次打印序列号方法
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());

        // 实例化三个 Frock 对象
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();

        // 打印三个序列号
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());

    }
}

class Frock {
    private static int currentNum = 100000; // 衣服默认序列号
    private final int serialNumber; // 序列号

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public static int getNextNum() {
        Frock.currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
package com.lhl.exercise.thread_;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/26_16:32
 */
public class ThreadTest01 {
    /*
     *   Java 语言实现线程有2种方式
     *   第一种：
     *       1. 编写一个类继承 java.lang.Thread
     *       2. 重写 run()
     *       3. new 线程对象
     *       4. 调用线程对象的 start() 启动线程
     * */
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("MainThread---->" + i);
        }
    }
}

// 自定义线程类
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThread---->" + i);
        }
    }
}
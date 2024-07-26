package com.lhl.exercise.thread_;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/26_16:51
 */
public class ThreadTest02 {
    /*
     *   Java 语言实现线程有2种方式
     *   第二种：
     *       1. 编写一个类实现 java.lang.Runnable 接口
     *       2. 实现类中 run() 方法
     *       3. new 线程对象
     *       4. 调用线程对象的 start() 启动线程
     * */
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());

        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("MainThread--->" + i);
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyRunnable----------->" + i);
        }
    }
}
package com.lhl.exercise.thread_.thread07;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/29_10:21
 */
public class ThreadTest07 {
    /*
     *  1. 在 Java 中，线程被分为两大类
     *      第一类：用户线程（非守护线程）
     *      第二类：守护线程（后台线程）
     *  2. 在 JVM 中，有一个隐藏的守护线程一直在守护：GC线程
     *  3. 守护线程的特点：所有用户线程退出之后，守护线程自动退出
     * */
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("t");
        // 启动之前设置线程为守护线程
        myThread.setDaemon(true);
        myThread.start();

        // 10s 结束
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "=====>" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(Thread.currentThread().getName() + "====>" + i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

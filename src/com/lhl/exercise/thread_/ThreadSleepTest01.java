package com.lhl.exercise.thread_;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/26_17:44
 */
public class ThreadSleepTest01 {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        t.setName("t");
        t.start();

        try {
            t.sleep(1000 * 5); // 等同于 Thread.sleep(1000 * 5)
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--------->" + i);
        }
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--------->" + i);
        }
    }
}

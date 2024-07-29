package com.lhl.exercise.thread_.thread05;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/29_10:09
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // t.stop(); Java 2 开始就废弃了，强行终止线程，容易导致数据丢失
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "=========>" + i);
        }
    }
}

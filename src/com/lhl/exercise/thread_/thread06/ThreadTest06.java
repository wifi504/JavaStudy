package com.lhl.exercise.thread_.thread06;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/29_10:15
 */
public class ThreadTest06 {
    /*
     * 正确的终止线程
     *
     * */
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mr.run = false;
    }
}

class MyRunnable implements Runnable {

    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "===>" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                return;
            }
        }
    }
}

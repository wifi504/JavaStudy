package com.lhl.exercise.thread_.thread15;

/**
 * @author lhl
 * Version 1.0
 * Create on 2024/7/30 11:41
 */
public class ThreadTest {
    /*
     *  写一个死锁
     * */
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        Thread t1 = new Thread(new MyRunnable1(o1, o2));
        Thread t2 = new Thread(new MyRunnable2(o1, o2));

        t1.start();
        t2.start();
    }
}

class MyRunnable1 implements Runnable {
    private Object o1;
    private Object o2;

    public MyRunnable1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyRunnable2 implements Runnable {
    private Object o1;
    private Object o2;

    public MyRunnable2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
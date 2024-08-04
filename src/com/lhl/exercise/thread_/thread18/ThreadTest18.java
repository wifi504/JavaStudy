package com.lhl.exercise.thread_.thread18;

/**
 * @author lhl
 * Version 1.0
 * Create on 2024/7/30 15:29
 */
public class ThreadTest18 {
    /*
     *  让三个线程相互交替输出
     * */

    // 共享对象（三个线程都去争夺这把锁）
    private static final Object lock = new Object();

    private static boolean t1Output = true;
    private static boolean t2Output = false;
    private static boolean t3Output = false;
    public static void main(String[] args) {
        // t1 线程，负责输出A
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 10; ++i) {
                        while (!t1Output) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        // 该 t1 线程输出，并且唤醒了
                        System.out.println(Thread.currentThread().getName() + "======> A");

                        t1Output = false;
                        t2Output = true;
                        t3Output = false;

                        // 唤醒所有线程
                        lock.notifyAll();
                    }
                }
            }
        }).start();

        // t2 线程，负责输出B
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 10; ++i) {
                        while (!t2Output) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        // 该 t1 线程输出，并且唤醒了
                        System.out.println(Thread.currentThread().getName() + "======> B");

                        t1Output = false;
                        t2Output = false;
                        t3Output = true;

                        // 唤醒所有线程
                        lock.notifyAll();
                    }
                }
            }
        }).start();

        // t3 线程，负责输出C
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 10; ++i) {
                        while (!t3Output) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        // 该 t1 线程输出，并且唤醒了
                        System.out.println(Thread.currentThread().getName() + "======> C");

                        t1Output = true;
                        t2Output = false;
                        t3Output = false;

                        // 唤醒所有线程
                        lock.notifyAll();
                    }
                }
            }
        }).start();
    }
}
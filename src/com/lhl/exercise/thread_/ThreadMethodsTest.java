package com.lhl.exercise.thread_;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/26_17:00
 */
public class ThreadMethodsTest {
    /*
     *   线程常用方法：
     *       实例方法
     *           String getName(); 获取线程对象的名字
     *           void setName(String threadName); 修改线程对象的名字
     *       静态方法
     *           static Thread currentThread(); 获取当前线程对象的引用
     * */

    public static void main(String[] args) {
        new TestThread("t1").start();
        new TestThread("t2").start();
        System.out.println("当前线程：" + Thread.currentThread().getName());
    }
}

class TestThread extends Thread {
    TestThread(String threadName) {
        super(threadName);
    }
    @Override
    public void run() {
        System.out.println("当前线程：" + Thread.currentThread().getName());
    }
}
package com.lhl.exercise.thread_.thread09;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/29_10:52
 */
public class ThreadTest09 {
    /*
     *  线程合并
     *      1. 调用 join() 方法完成线程合并
     *      2. join() 方法是一个实例方法
     *      3. 假设在 main 方法（线程）中调用了 t.join()，t线程会被合并到主线程，主线程进入阻塞状态，直到t结束
     *      4. t.join() 方法其实是让当前线程进入阻塞状态
     *      5. 和 sleep() 方法类似，但不一样
     *          第一：sleep 方法是静态方法，join是实例方法
     *          第二：sleep 方法可以指定睡眠时长，join方法不能保证阻塞时长
     *          第三：sleep 和join方法都是让当前线程进入阻塞状态
     *          第四：sleep 的阻塞解除条件：时间过去了
     *               join 的阻塞解除条件：调用join的线程结束了
     *
     * */
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setName("t");
        t.start();

        try {
            t.join(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
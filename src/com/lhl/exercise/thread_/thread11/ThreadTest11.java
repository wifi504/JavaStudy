package com.lhl.exercise.thread_.thread11;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/29_11:14
 */
public class ThreadTest11 {
    /*
     *  关于JVM调度
     *      1. 让位
     *      2. 静态方法 Thread.yield()
     *      3. 让当前线程让位
     *      4. 注意，让位不会让其进入阻塞状态，只是放弃目前占有的CPU时间片，进入就绪状态，继续抢夺CPU时间片
     *      5. 只能保证大方向上的，大概率，到了某个点位让一次
     * */

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("t1");
        MyThread t2 = new MyThread();
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            if (Thread.currentThread().getName().equals("t1") && i % 10 == 0) {
                System.out.println("t1让位...");
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() + "====>" + i);
        }
    }
}

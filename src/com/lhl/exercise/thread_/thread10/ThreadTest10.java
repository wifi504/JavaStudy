package com.lhl.exercise.thread_.thread10;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/29_11:06
 */
public class ThreadTest10 {
    /*
     *  关于线程生命周期中的 JVM 调度
     *      1. 优先级
     *      2. 线程是可以设置优先级的，优先级较高的，获得CPU时间片的总体概率高一些
     *      3. JVM 采用的是抢占式调度模型，谁的优先级高，获取CPU时间片的总体概率就高
     *      4. 默认情况下，一个线程的优先级是5
     *      5. 最低是1，最高是10
     * */
    public static void main(String[] args) {
        System.out.println("最低优先级：" + Thread.MIN_PRIORITY);
        System.out.println("最高优先级：" + Thread.MAX_PRIORITY);
        System.out.println("默认优先级：" + Thread.NORM_PRIORITY);

        // 获取main线程的优先级
        Thread mainThread = Thread.currentThread();

        System.out.println("main线程的优先级：" + mainThread.getPriority());

        // 设置优先级
        mainThread.setPriority(10);
        System.out.println("main线程的优先级：" + mainThread.getPriority());

    }
}

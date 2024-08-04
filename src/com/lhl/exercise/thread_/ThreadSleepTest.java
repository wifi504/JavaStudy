package com.lhl.exercise.thread_;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/26_17:37
 */
public class ThreadSleepTest {
    /*
     *  关于线程的 sleep 方法
     *      1. static void sleep(long millis)
     *          静态方法，没有返回值，参数是一个毫秒
     *      2. 方法的作用是：
     *          让当前线程进入休眠，也就是让当前线程放弃占有的CPU时间片，让其进入阻塞状态
     *          在指定毫秒时间内，线程没有权利抢夺CPU时间片
     *      3. run() 方法在方法重写时候，不能在方法声明位置使用 throws 抛出异常
     *      4. sleep 方法可以实现每隔多久调用指定方法
     * */

    public static void main(String[] args) {
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "睡醒了");
    }
}

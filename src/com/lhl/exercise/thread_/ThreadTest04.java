package com.lhl.exercise.thread_;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/26_17:50
 */
public class ThreadTest04 {
    /*
     *   怎么中断线程睡眠，解除线程因sleep导致的阻塞，让其开始抢夺CPU时间片
     * */
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000 * 60 * 60 * 24 * 365L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "起来干活了");
            }
        }).start();
    }
}

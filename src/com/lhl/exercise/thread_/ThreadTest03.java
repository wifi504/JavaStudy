package com.lhl.exercise.thread_;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/26_16:57
 */
public class ThreadTest03 {
    /*
     *   使用匿名内部类的实现方式
     * */
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("t----------------->" + i);
                }
            }
        }).start();
        for (int i = 0; i < 100; i++) {
            System.out.println("Main-->" + i);
        }
    }
}

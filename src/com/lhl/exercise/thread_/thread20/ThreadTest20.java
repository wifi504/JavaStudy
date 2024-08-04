package com.lhl.exercise.thread_.thread20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/31_17:31
 */
public class ThreadTest20 {
    /*
     *  线程池创建线程
     * */
    public static void main(String[] args) {
        // 创建3个线程的线程池对象
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // 提交任务给线程池
        for (int i = 0; i < 4; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(Thread.currentThread().getName() + "====>" + i);
                    }
                }
            });
        }

        // 记得关闭线程池
        executorService.shutdown();
    }
}

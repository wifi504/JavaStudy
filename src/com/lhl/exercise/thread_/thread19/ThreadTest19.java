package com.lhl.exercise.thread_.thread19;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/31_17:26
 */
public class ThreadTest19 {
    /*
     *  实现线程的第三种方式：Callable
     *  可以获取返回值
     *  拿到返回值之前当前线程会被阻塞
     * */

    public static void main(String[] args) {
        // 创建“未来任务”对象
        FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(5000);
                return 1;
            }
        });

        Thread t = new Thread(task);
        t.setName("t");
        t.start();

        try {
            Integer i = task.get();
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



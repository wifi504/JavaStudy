package com.lhl.exercise.thread_.thread20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/31_18:24
 */
public class ThreadPool {
    /*
     *  1、编写10个线程，
     *  第一个线程从1加到10，
     *  第二个线程从11加到20
     *  …
     *  第十个线程从91加到100
     *  最后将10个线程的结果相加
     * */

    public static void main(String[] args) {
        // 创建10个线程
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // 提交计算任务
        for (int i = 10; i <= 100; i += 10) {
            executorService.submit(new ComputeSum(i - 9, i, 1));
        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("全部线程退出，累加结果为：" + ComputeSum.getSum());


    }
}

// 创建基础线程类，负责完成等差数列求和
class ComputeSum implements Runnable {
    private final int firstNum; // 首项
    private final int endNum; // 末项
    private final int increase; // 公差

    private static int sum; // 总和

    public ComputeSum(int firstNum, int endNum, int increase) {
        this.firstNum = firstNum;
        this.endNum = endNum;
        this.increase = increase;
    }

    public static int getSum() {
        return sum;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = firstNum; i <= endNum; i += increase) {
            sum += i;
        }

        System.out.println("线程" + Thread.currentThread().getName()
                + "计算了从" + firstNum + "加到" + endNum + "，结果是：" + sum);
        ComputeSum.sum += sum;

    }
}
package com.lhl.exercise.thread_.thread08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/29_10:30
 */
public class ThreadTest08 {
    /*
     * JDK 提供的定时任务
     *   java.util.Timer    定时器
     *   java.util.TimerTask    定时任务
     * 定时器 + 定时任务 可以帮我们完成每间隔多久执行一次某程序
     *
     * Timer的构造方法
     *      Timer()
     *      Timer(boolean isDaemon) 是不是守护线程
     * */
    public static void main(String[] args) {
        Timer timer = new Timer();

        // 指定定时任务
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = null;
        try {
            firstTime = sdf.parse("2024-07-29 10:47:30");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        timer.schedule(new LogTimerTask(), firstTime, 1000);


        // 匿名内部类实现
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Test");
            }
        }, firstTime, 1000);
    }
}

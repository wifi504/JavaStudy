package com.lhl.exercise.thread_.thread08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/29_10:35
 */
public class LogTimerTask extends TimerTask {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
    int count = 0;

    @Override
    public void run() {
        // 执行任务
        Date date = new Date();
        String strTime = sdf.format(date);
        System.out.println(strTime + ": " + count++);
    }
}

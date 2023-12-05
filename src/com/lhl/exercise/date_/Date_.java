package com.lhl.exercise.date_;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/5_17:48
 */
public class Date_ {

    // 第一代日期类

    public static void main(String[] args) {

        // 获取日期
        Date date = new Date();
        System.out.println(date);

        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(date));

        // 通过时间戳获取时间
        Date date1 = new Date(1145141919810L);
        System.out.println(sdf.format(date1));

    }
}

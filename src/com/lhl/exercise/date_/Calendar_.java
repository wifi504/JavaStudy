package com.lhl.exercise.date_;

import java.util.Calendar;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/5_17:55
 */
public class Calendar_ {

    // 第二代日期类

    public static void main(String[] args) {

        // 创建日历对象
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        // 从日历对象中获取字段
        System.out.println("年：" + c.get(Calendar.YEAR));
        System.out.println("月：" + (c.get(Calendar.MONTH) + 1));
        System.out.println("日：" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时：" + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("分钟：" + c.get(Calendar.MINUTE));
        System.out.println("秒：" + c.get(Calendar.SECOND));
    }
}

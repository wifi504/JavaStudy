package com.lhl.exercise.date_;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/5_18:02
 */
public class LocalDate_ {

    // 第三代日期类

    public static void main(String[] args) {

        // LocalDate        获取日期
        // LocalTime        获取时间
        // LocalDateTime    获取日期和时间

        LocalDateTime ldt = LocalDateTime.now(); // now() 返回当前的日期时间
        System.out.println(ldt);

        // 获取指定的信息
        System.out.println(ldt.getYear());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getSecond());

        // -------------- 常用方法 ---------------

        // 格式化日期
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = pattern.format(ldt);
        System.out.println(format);

        // 对当前日期加10个月
        System.out.println(ldt.plusMonths(10));

        // 114514小时后是什么时候
        System.out.println(ldt.plusHours(114514));

        // 6666天前是什么时候
        System.out.println(ldt.minusDays(6666));

        // ...... 各种加减操作，很方便，查阅API文档
    }
}

package com.lhl.exercise.date_;

import java.time.Instant;
import java.util.Date;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/5_18:12
 */
public class Instant_ {

    // 时间戳

    public static void main(String[] args) {

        Instant now = Instant.now(); // 获取当前时间戳

        Date date = Date.from(now); // form() 可以将时间戳转换成 Date

        Instant ins = date.toInstant(); // toInstant() 可以把 Date 转换成时间戳
    }
}

package com.lhl.exercise.io;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/25_15:09
 */
public class PrintStreamTest {
    public static void main(String[] args) {
        // 打印流可以打印各种数据类型数据
        try (PrintStream ps = new PrintStream("testFiles/test6.txt")) {
            ps.println(100);
            ps.println(false);
            ps.println("abc");
            ps.println('T');
            ps.println(3.14);
            ps.println("hello world");
            ps.println(114514);
            ps.println(300);

            String name = "张三";
            double score = 99.456441;

            ps.printf("姓名：%s，分数：%.2f", name, score);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

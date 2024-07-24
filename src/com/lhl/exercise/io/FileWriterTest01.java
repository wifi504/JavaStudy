package com.lhl.exercise.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2024/7/24_16:35
 */
public class FileWriterTest01 {
    /*
     *   文件字符输出流，写，以字符形式写出文件，一次至少写出一个完整字符
     *
     * */
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("testFiles/test3.txt")) {
            // 开始写
            writer.write("hello world");
            writer.append("\n");
            writer.write("张三李四王五赵六");
            writer.append("\n");
            writer.write("张三李四王五赵六".toCharArray());
            writer.append("\n");
            writer.write("张三李四王五赵六".toCharArray(), 2, 2);
            writer.append("\n");

            // 追加写
            writer.append("张三李四王五赵六");
            writer.append("\n");

            // 刷新
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

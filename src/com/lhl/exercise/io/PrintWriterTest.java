package com.lhl.exercise.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/25_15:19
 */
public class PrintWriterTest {
    /*
     *   需要手动刷新！
     *   多一个构造方法：
     *       PrintStream:
     *           PrintStream(OutputStream)
     *       PrintWriter:
     *           PrintWriter(OutputStream)
     *           PrintWriter(Writer)
     * */
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("testFiles/test7.txt"))) {
            pw.println("测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

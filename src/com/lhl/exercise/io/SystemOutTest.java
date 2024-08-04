package com.lhl.exercise.io;

import java.io.PrintStream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/25_15:47
 */
public class SystemOutTest {
    /*
     *   标准输出流：System.out
     *       1. 数据去向：控制台
     *       2. 普通输出流的数据去向？文件或者网络或其他...
     *       3. 可以使用 System.setOut(OutputStream os) 修改标准输出流
     * */
    public static void main(String[] args) {
        PrintStream out = System.out;
        // 输出
        out.println("hello world");
    }
}

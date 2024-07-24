package com.lhl.exercise.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2024/7/23_16:37
 */
public class FileOutputStreamTest01 {
    /*
     * java.io.FileOutputStream
     *   1. 文件字节输出流，负责写
     *   2. 构造器
     *       FileOutputStream(String name)
     *           创建一个文件字节输出流对象，这个流在使用时，最开始会将原文件内容全部清空，然后写入
     *       FileOutputStream(String name, boolean append)
     *           创建一个文件字节输出流对象，这个流在使用时，如果append为true，则不会清空原文件内容，而是直接在文件末尾追加内容
     *   3. 常用方法
     *       void close();
     *       void flush();
     *       void write(int b);  写一个字节
     *       void write(byte[] b);  将整个字节数组全部写出
     *       void write(byte[] b, int off, int len);  将字节数组的指定部分写出
     * */

    public static void main(String[] args) {

        // 创建文件字节输出流对象，要覆盖源文件
        OutputStream out = null;
        try {
            out = new FileOutputStream("testFiles/test2.txt");

            // 开始写
            out.write(97);
            out.write("test bytes[]".getBytes());
            out.write("abcdefg".getBytes(), 2, 2);


            // 记着刷新
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        // 创建文件字节输出流对象，不覆盖源文件
        OutputStream out1 = null;
        try {
            out1 = new FileOutputStream("E:/lhl/javaCode/JavaStudy/testFiles/test2.txt", true);

            // 开始写
            out1.write(10);
            out1.write(97);
            out1.write(98);
            out1.write(99);
            out1.write(100);
            out1.write(101);

            // 记着刷新
            out1.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            if (out1 != null) {
                try {
                    out1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package com.lhl.exercise.io;

import java.io.*;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2024/7/23_16:37
 */
public class FileInputStreamTest01 {
    /*
     * java.io.FileInputStream:
     *  1. 称为文件字节输入流，用于读取文件
     *  2. 是一个万能流，任何文件都可以读，但还是建议读取二进制文件
     *  3. 但是 FileInputStream 肯定可以读取普通文本的，只不过一次读取一个字节，容易出现乱码问题
     *  4. FileInputStream 的常用构造方法：
     *       FileInputStream(String name) 通过文件路径创建字节输入流对象
     *  5. FileInputStream 的常用方法：
     *       int read() 读取一个字节，返回一个int值，如果返回-1，表示读取完毕
     *       int read(byte[] b) 读取最多 b.length 个字节，返回一个int值，表示读取了多少个，如果返回-1，表示读取完毕
     *       int read(byte[] b, int off, int len) 读取最多 len 个字节，返回一个int值，表示读取了多少个，如果返回-1，表示读取完毕
     *       long skip(long n) 跳过 n 个字节，返回实际跳过的字节数
     *       int available() 返回可读的字节数（估计的）
     *       void close() 关闭流，释放资源
     * */
    public static void main(String[] args) {
        InputStream in = null;
        try {
            // 创建字节输入流对象
            in = new FileInputStream("E:/lhl/javaCode/JavaStudy/testFiles/test1.txt");

            // 一个字节一个字节读取文件
            int readByte = 0;
            while ((readByte = in.read()) != -1) {
                System.out.print((char) readByte);
            }
            in.close();
            System.out.println();

            // 一次读取多个字节
            in = new FileInputStream("E:/lhl/javaCode/JavaStudy/testFiles/test1.txt");
            byte[] bytes = new byte[1024];
            int readCount = in.read(bytes);
            System.out.println("读取了" + readCount + "个字节");
            System.out.println(new String(bytes, 0, readCount));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

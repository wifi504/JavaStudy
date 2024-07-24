package com.lhl.exercise.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2024/7/23_10:40
 */
public class FileInputStreamTest02 {
    // 测试 int read(byte[] b, int off, int len); 一次读取len个字节，将读到的数据从byte数组的off位置开始放
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:/lhl/javaCode/JavaStudy/testFiles/test1.txt");

            byte[] bytes = new byte[10];
            fis.read(bytes, 3, 5);
            System.out.println(Arrays.toString(bytes));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

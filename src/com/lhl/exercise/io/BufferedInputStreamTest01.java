package com.lhl.exercise.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author lhl
 * Version 1.0
 * Create on 2024/7/25 10:43
 */
public class BufferedInputStreamTest01 {
    /*
     *  1. java.io.BufferedInputStream 的用法和 FileInputStream 用法相同
     *  2. 他们的不同点是
     *        FileInputStream 是节点流
     *        BufferedInputStream 是缓冲流（包装流、处理流），自带缓冲区，自动维护，效率高
     * */

    public static void main(String[] args) {

        BufferedInputStream bis = null;
        try {
//            // 创建节点流
//            FileInputStream in = new FileInputStream("testFiles/test1.txt");
//            // 创建包装流
//            bis = new BufferedInputStream(in);

            // 组合写法
            bis = new BufferedInputStream(new FileInputStream("testFiles/test1.txt"));

            // 读取
            int readCount = 0;
            byte[] bytes = new byte[1024];
            while ((readCount = bis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, readCount));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package com.lhl.exercise.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/25_15:32
 */
public class SystemInTest {
    /*
     *   标准输入流：System.in
     *       1. 数据来源：控制台
     *       2. 普通输入流的数据来源？文件或者网络或其他...
     *       3. 可以使用 System.setIn(InputStream is) 修改标准输入流
     * */
    public static void main(String[] args) {
        try {
            InputStream in = System.in;
            byte[] bytes = new byte[1024];
            int readCount = in.read(bytes);
            for (int i = 0; i < readCount; i++) {
                System.out.println((char) bytes[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

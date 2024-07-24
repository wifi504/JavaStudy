package com.lhl.exercise.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2024/7/24_15:24
 */
public class FileInputOutputStreamCopy01 {
    /*
     *   使用 Java7 新特性优化 try-with-resource
     * */

    public static void main(String[] args) {

        try (FileInputStream input = new FileInputStream("E:/BaiduNetdiskDownload/jdk-17_windows-x64_bin.exe");
             FileOutputStream output = new FileOutputStream("E:/lhl/javaCode/JavaStudy/testFiles/jdk17install.exe")) {

            // 一次至少拷贝1kB
            byte[] bytes = new byte[1024];
            int readCount = 0;
            while ((readCount = input.read(bytes)) != -1) {
                output.write(bytes, 0, readCount);
            }

            // 刷新
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


package com.lhl.exercise.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2024/7/24_15:24
 */
public class FileInputOutputStreamCopy {
    /*
     *   文件拷贝，实现原理：
     *       使用FileInputStream读取文件，使用FileOutputStream写入文件
     *       一边读、一边写
     * */

    public static void main(String[] args) {
        // 输入流
        FileInputStream input = null;
        // 输出流
        FileOutputStream output = null;

        try {
            // 读这个文件
            input = new FileInputStream("E:/BaiduNetdiskDownload/jdk-17_windows-x64_bin.exe");
            // 粘贴到这
            output = new FileOutputStream("testFiles/jdk17install.exe");

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
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}

package com.lhl.exercise.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2024/7/24_16:43
 */
public class FileReaderWriterCopy {
    /*
     *   使用文件字符输入输出流进行文件复制，但是这种方式只适用于普通文本文件
     * */
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("E:/lhl/javaCode/JavaStudy/testFiles/test3.txt");
             FileWriter writer = new FileWriter("E:/lhl/javaCode/JavaStudy/testFiles/test3_copy.txt")) {

            // Copy
            char[] chars = new char[5];
            int readCount = 0;
            while ((readCount = reader.read(chars)) != -1) {
                writer.write(chars, 0, readCount);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

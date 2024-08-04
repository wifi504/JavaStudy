package com.lhl.exercise.io;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2024/7/24_16:30
 */
public class FileReaderTest01 {
    /*
     *  文件字符输入流，读，以字符形式读取文件，一次至少读取一个完整字符
     *
     *  与FileInputStream相似
     *      常用构造方法：
     *          FileReader(String filePath)
     *      常用方法：
     *          int read(char[] cbuf)
     *          int read(char[] cbuf, int off, int len)
     *          long skip(long n)
     *          void close()
     * */

    public static void main(String[] args) {
        try (FileReader reader = new FileReader("testFiles/test1.txt")) {
            // 开始读
            char[] chars = new char[512];
            int readCount = 0;
            while ((readCount = reader.read(chars)) != -1) {
                System.out.println(new String(chars, 0, readCount));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

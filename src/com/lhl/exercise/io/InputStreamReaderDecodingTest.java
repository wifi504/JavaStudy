package com.lhl.exercise.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * @author lhl
 * Version 1.0
 * Create on 2024/7/25 11:52
 */
public class InputStreamReaderDecodingTest {
    /*
     *   使用 InputStreamReader 时，可以指定解码的字符集，用来解决乱码问题
     *   InputStreamReader是一个字符流，是一个转换流
     *   InputStreamReader是一个输入过程
     *   InputStreamReader是一个解码过程
     * */

    public static void main(String[] args) {
        // 可以指定编解码格式
        try (InputStreamReader isr = new InputStreamReader(
                new FileInputStream("testFiles/test3_gbk.txt"), Charset.forName("GBK"))) {
            int readCount = 0;
            char[] chars = new char[512];
            while ((readCount = isr.read(chars)) != -1) {
                System.out.println(new String(chars, 0, readCount));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

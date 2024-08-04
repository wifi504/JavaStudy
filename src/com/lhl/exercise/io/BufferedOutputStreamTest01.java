package com.lhl.exercise.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author lhl
 * Version 1.0
 * Create on 2024/7/25 10:53
 */
public class BufferedOutputStreamTest01 {
    /*
     *      和Input一样
     * */

    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("testFiles/test4.txt"))) {
            for (int i = 0; i < 1024; i++) {
                bos.write("buffered output stream writer!  ".getBytes());
            }

            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

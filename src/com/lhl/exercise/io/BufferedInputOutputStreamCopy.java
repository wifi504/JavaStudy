package com.lhl.exercise.io;

import java.io.*;

/**
 * @author lhl
 * Version 1.0
 * Create on 2024/7/25 10:59
 */
public class BufferedInputOutputStreamCopy {
    /*
     *   使用缓冲的流来进行文件拷贝，对比效率
     *
     * */

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("testFiles/test4.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("testFiles/test4_copy.txt"))) {

            byte[] bytes = new byte[1024];
            int readCount = 0;
            while ((readCount = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, readCount);
            }

            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Buffered Copy: " + (end - begin) / 1000 + "s");
    }
}

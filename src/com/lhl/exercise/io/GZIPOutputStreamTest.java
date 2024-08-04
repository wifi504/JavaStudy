package com.lhl.exercise.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/25_18:14
 */
public class GZIPOutputStreamTest {
    /*
     * 文件压缩流(*.gz)
     * */
    public static void main(String[] args) {
        // 指定要压缩的文件
        File file = new File("testFiles/test4.txt");
        // 压缩到哪里
        File pkg = new File("testFiles/test4.gz");

        try (FileInputStream fis = new FileInputStream(file);
             GZIPOutputStream gzip = new GZIPOutputStream(new FileOutputStream(pkg))) {
            int readCount = 0;
            byte[] bytes = new byte[1024];
            while ((readCount = fis.read(bytes)) != -1) {
                gzip.write(bytes);
            }
            gzip.finish();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

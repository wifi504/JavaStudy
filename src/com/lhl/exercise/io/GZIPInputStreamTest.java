package com.lhl.exercise.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/25_18:31
 */
public class GZIPInputStreamTest {
    public static void main(String[] args) {
        File file = new File("testFiles/test4.gz");
        File file1 = new File("testFiles/test4_unpkg.txt");
        try (GZIPInputStream gzip = new GZIPInputStream(new FileInputStream(file));
             FileOutputStream fos = new FileOutputStream(file1)) {
            int readCount = 0;
            byte[] bytes = new byte[1024];
            while ((readCount = gzip.read(bytes)) != -1) {
                fos.write(bytes, 0, readCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

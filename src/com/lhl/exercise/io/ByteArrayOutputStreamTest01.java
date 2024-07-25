package com.lhl.exercise.io;

import java.io.ByteArrayOutputStream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/25_18:42
 */
public class ByteArrayOutputStreamTest01 {
    public static void main(String[] args) {
        // 基本用法
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        baos.write(1);
        baos.write(2);
        baos.write(3);
        baos.write(4);
        baos.write(5);

        byte[] byteArray = baos.toByteArray();
        for (byte b : byteArray) {
            System.out.println(b);
        }
    }
}

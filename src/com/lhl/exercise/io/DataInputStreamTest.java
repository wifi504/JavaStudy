package com.lhl.exercise.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author lhl
 * Version 1.0
 * Create on 2024/7/25 12:48
 */
public class DataInputStreamTest {
    /*
     *  java.io.DataInputStream: 数据流（数据字节输入流）
     *  作用：专门用来读取 DataOutputStream 流写入的文件
     * */
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("testFiles/data"))) {
            // 开始读
            byte b = dis.readByte();
            short s = dis.readShort();
            int i = dis.readInt();
            long l = dis.readLong();
            float f = dis.readFloat();
            double d = dis.readDouble();
            boolean flag = dis.readBoolean();
            char c = dis.readChar();
            String str = dis.readUTF();

            System.out.println(b);
            System.out.println(s);
            System.out.println(i);
            System.out.println(l);
            System.out.println(f);
            System.out.println(d);
            System.out.println(flag);
            System.out.println(c);
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

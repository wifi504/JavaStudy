package com.lhl.exercise.io;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lhl
 * Version 1.0
 * Create on 2024/7/25 12:33
 */
public class DataOutputStreamTest {
    /*
     *  java.io.DataOutputStream: 数据流（数据字节输出流）
     *  作用：将java程序中的数据直接写入到文件，写到文件中就是二进制
     *      DataOutputStream 写的效率很高，原因是写过程不需要转码
     *      DataOutputStream 写到文件中的数据，只能由DataInputStream来读取
     * */

    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("testFiles/data"))) {

            // 准备数据
            byte b = 127;
            short s = 32767;
            int i = 2147483647;
            long l = 111111111111111111L;
            float f = 3.0F;
            double d = 3.14;
            boolean flag = false;
            char c = '好';
            String str = "好好好";

            // 开始写
            dos.writeByte(b);
            dos.writeShort(s);
            dos.writeInt(i);
            dos.writeLong(l);
            dos.writeFloat(f);
            dos.writeDouble(d);
            dos.writeBoolean(flag);
            dos.writeChar(c);
            dos.writeUTF(str);

            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

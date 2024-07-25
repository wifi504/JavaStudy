package com.lhl.exercise.io;

import java.io.*;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/25_18:46
 */
public class ByteArrayOutputStreamTest02 {
    /*
     * 包装流和节点流可以随意组合
     *
     * ByteArrayIOStream 直接复制对象可以做到深克隆
     * */
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeInt(100);
            oos.writeBoolean(true);
            oos.writeDouble(3.14);
            oos.writeUTF("真厉害");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (byte b : baos.toByteArray()) {
            System.out.println(b);
        }
        System.out.println("======================================");

        // 使用 ByteArrayInputStream 恢复
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        try (ObjectInputStream ois = new ObjectInputStream(bais)) {
            System.out.println(ois.readInt());
            System.out.println(ois.readBoolean());
            System.out.println(ois.readDouble());
            System.out.println(ois.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

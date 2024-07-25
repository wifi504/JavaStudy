package com.lhl.exercise.io;

import java.io.*;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/25_14:57
 */
public class ObjectOutputStreamTestSerial {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("testFiles/testObj"))) {
            oos.writeObject(new Test(3.14, 114514));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Test implements Serializable {
    @Serial
    private static final long serialVersionUID = -7621694040173458079L; // 对象序列化版本号

    public Test(double d, int id) {
        this.d = d;
        this.id = id;
    }

    private double d;
    private transient int id; // transient 关键字会让该属性不参与序列化
}
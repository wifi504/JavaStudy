package com.lhl.exercise.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author lhl
 * Version 1.0
 * Create on 2024/7/25 13:48
 */
public class ObjectOutputStreamTest {
    /*
     *  java.io.ObjectOutputStream: 对象流（对象字节输出流）
     *      1. 它的作用是完成对象的序列化过程
     *      2. 它可以将 JVM 当中的 Java 对象序列化到文件/网络中
     *      3. 序列化：将 Java 对象转换为字节序列的过程（字节序列可以在网络中传输）
     *      4. 序列化：serial
     *      5. Java 程序中类实现了 Serializable 接口，编译器会自动给该类添加一个序列化版本号
     *          在 Java 语言中如何区分 Class 版本的，首先判断类名，然后再通过序列化版本号再进行区分
     *          如果希望一个类再未来进行了修改，但是还希望它仍然可以反序列化，需要在最开始指定一个序列化版本号
     *          @Serial
     *          private static final long serialVersionUID = 12345678L
     * */
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("testFiles/testDates"))) {

            Date date1 = new Date();
            Date date2 = new Date();
            Date date3 = new Date();
            Date date4 = new Date();
            Date date5 = new Date();
            Date date6 = new Date();

            ArrayList<Date> dates = new ArrayList<>();
            dates.add(date1);
            dates.add(date2);
            dates.add(date3);
            dates.add(date4);
            dates.add(date5);
            dates.add(date6);

            oos.writeObject(dates);

            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

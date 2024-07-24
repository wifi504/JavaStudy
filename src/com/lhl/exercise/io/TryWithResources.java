package com.lhl.exercise.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2024/7/24_15:59
 */
public class TryWithResources {
    /*
     *  Java7 新特性：
     *      try-with-resources 资源自动关闭
     *      凡是实现了AutoCloseable接口的类都可以使用try-with-resources，都会自动关闭
     *      try-with-resources 语法格式：
     *          try(资源1;资源2;资源3) {
     *
     *          } catch(Exception e) {
     *
     *          }
     *
     * */
    public static void main(String[] args) {
        // 测试语法
        FileInputStream in2 = null;

        try (FileInputStream in = new FileInputStream("E:/lhl/javaCode/JavaStudy/testFiles/test1.txt")) {
            in2 = in;
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(in2.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

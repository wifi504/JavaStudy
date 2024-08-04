package com.lhl.exercise.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2024/7/24_16:52
 */
public class AboutFilePath {
    /*
     *      目前读写文件都是用的绝对路径，这样操作会导致代码可移植性和可维护性非常低
     *      于是我们应该使用相对路径，在IDEA中，相对路径默认是project根
     *
     *      将前面所学的代码中的绝对路径统一替换为相对路径
     * */

    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("log")) {
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // 应该在这抛出异常，因为JavaStudy文件夹下没有log
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // 补充，从类路径中加载资源
            String path = Thread.currentThread().getContextClassLoader().getResource("xxx文件").getPath();
            System.out.println(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

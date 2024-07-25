package com.lhl.exercise.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/25_17:05
 */
public class LoadProperties {
    /*
     * 使用 Properties 集合类 + IO流实现读取属性配置文件
     * */
    public static void main(String[] args) {
        File file = new File("testFiles/test.properties");
        try (FileReader fr = new FileReader(file)) {
            Properties pro = new Properties();
            pro.load(fr);
            Enumeration<?> names = pro.propertyNames();
            while (names.hasMoreElements()) {
                String k = (String) names.nextElement();
                String v = pro.getProperty(k);
                System.out.printf("对象的键：%s；对象的值：%s\n", k, v);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

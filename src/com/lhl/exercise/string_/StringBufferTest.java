package com.lhl.exercise.string_;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/5_0:56
 */
public class StringBufferTest {
    public static void main(String[] args) {
        // 可变字符序列，效率远大于 String 但略低于 StringBuilder ，线程安全

        StringBuffer stringBuffer = new StringBuffer("hello");

        // ----------- 转换 ------------

        // String -> StringBuffer
        String str = "hello world";
        StringBuffer stb = new StringBuffer(str); // 方式一

        StringBuffer stb1 = new StringBuffer();
        stb1 = stb1.append(str); // 方式二

        // StringBuffer -> String
        StringBuffer test = new StringBuffer("This is StringBuffer");
        String str1 = test.toString(); // 方式一

        String str2 = new String(test); // 方式二


        // ----------- 常用方法 -------------

        StringBuffer s = new StringBuffer("hello");

        // 增
        s.append(','); // hello,
        s.append("好好好"); // hello,好好好
        s.append("abc").append(100).append(true).append(10.5); // hello,好好好abc100true10.5
        System.out.println(s);

        // 删
        s.delete(6, 9); // 删除索引（前包含后不包含）
        System.out.println(s);

        // 改
        s.replace(6, 9, "def");
        System.out.println(s);

        // 查
        System.out.println(s.indexOf("true"));
        System.out.println(s.indexOf("false"));

        // 插
        System.out.println(s.insert(5, " world"));
        System.out.println(s);

        // 长度
        System.out.println(s.length());
    }
}

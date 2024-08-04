package com.lhl.exercise.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/25_15:42
 */
public class SystemInTest01 {
    /*
     * 使用 BufferedReader 包装标准输入流接受键盘用户输入
     * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = br.readLine()) != null) {
            System.out.println("您输入了：" + s);
        }
    }
}

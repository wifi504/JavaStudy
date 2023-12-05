package com.lhl.exercise.string_;

import java.util.Scanner;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/5_11:13
 */
public class StringBufferExercise {
    public static void main(String[] args) {
        /*
        输入商品名称和商品价格，要求打印效果示例，使用前面学习的方法完成:

        商品名   商品价格
        手机     123,564.59   比如价格 3,456,789.88

        要求:价格的小数点前面每三位用逗号隔开，在输出。
         */

        Scanner scanner = new Scanner(System.in);
        String price = scanner.next();

        StringBuffer sb = new StringBuffer(price);
        int index = sb.lastIndexOf(".");
        for (int i = index - 3; i > 0; i -= 3) {
            sb = sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}

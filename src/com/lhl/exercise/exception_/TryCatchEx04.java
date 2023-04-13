package com.lhl.exercise.exception_;

import java.util.Scanner;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/04/08_14:21
 */
public class TryCatchEx04 {
    public static void main(String[] args) {
        // 如果用户输入的不是整数就反复要求输入直到整数为止
        Scanner input = new Scanner(System.in);
        int i;

        while (true) {
            try {
                System.out.println("输入一个整数：");
                i = Integer.parseInt(input.next());
                break;
            } catch (Exception e) {
                System.out.println("Exception: " + e + "; 请重新输入！");
            }
        }
        System.out.println(i);
    }
}

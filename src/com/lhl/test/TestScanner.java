package com.lhl.test;

import java.util.Scanner;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/05/05_13:27
 */
public class TestScanner {
    public static void main(String[] args) {
        String str = null;
        Scanner input = new Scanner(System.in);
        int count = 0;
        do {
            str = input.next();
            count++;
        } while (!str.equals("STOP"));
        System.out.println(count - 1);

    }
}

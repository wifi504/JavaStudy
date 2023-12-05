package com.lhl.exercise.math_;

import java.util.Arrays;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/5_11:40
 */
public class RandomTest {
    public static void main(String[] args) {
        // 返回 10 个 2-7 的随机整数
        for (int i = 0; i < 10; ++i) {
            System.out.println((int) (Math.random() * 6) + 2);
        }

        // 检查 2-7 的概率
        int loop = 100000000;
        int[] count = new int[6];
        for (int i = 0; i < loop; ++i) {
            count[((int) (Math.random() * 6) + 2) - 2]++;
        }
        System.out.println(Arrays.toString(count));

        for (int i = 2; i <= 7; ++i) {
            System.out.println("数字" + i + "的概率是：" + count[i - 2] * 100 / (double) loop + "%");
        }
    }
}

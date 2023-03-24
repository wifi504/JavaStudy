package com.lhl.javaCode;

public class MonkeyPeach {
    public static void main(String[] args) {
        int m = 10;
        System.out.println("最开始有" + f(m) + "个桃子！");
    }

    public static int f(int x) {
        if (x == 1) {
            return 1;
        } else {
            return 2 * (f(x - 1) + 1);
        }
    }
}

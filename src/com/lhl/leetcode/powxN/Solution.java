package com.lhl.leetcode.powxN;

// 苦苦挣扎，好不容易不超时，2492 ms
class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        long n1 = (long)n;
        if (x == -1 && n % 2 == 0) {
            return 1;
        } else if (x == -1 && n % 2 != 0) {
            return -1;
        }
        if (n1 == 0 || x == 1) {
            // 任何数的零次幂都为一，1的任何次幂都为一
            return 1;
        } else if (n1 > 0) {
            // n 个 x 相乘
            for (long i = 0l; i < n1; ++i) {
                res *= x;
            }
        } else {
            // n 个 1/x 相乘
            n1 *= -1;
            for (long i = 0l; i < n1; ++i) {
                res *= 1/x;
                if (res == 0) break;
            }
        }
        return res;
    }
}
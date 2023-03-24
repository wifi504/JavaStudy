package com.lhl.leetcode.findTheStudentThatWillReplaceTheChalk;

// int太小了，改long，确切来说是太多无意义循环了
class Solution1 {
    public int chalkReplacer(int[] chalk, int k) {

        // 求和 sum
        int sum = 0;
        for (int i = 0; i < chalk.length; ++i) {
            sum += chalk[i];
        }

        // k 对 sum 取余，得到余数 n
        int n = k % sum;

        // 判断是第几个同学
        for (int i = 0; i < chalk.length; ++i) {
            n -= chalk[i];
            if (n < 0) return i;
        }
        return -1;
    }
}
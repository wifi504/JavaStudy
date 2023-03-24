package com.lhl.leetcode.findTheStudentThatWillReplaceTheChalk;

// 先取余，再循环，避免无意义循环
class Solution2 {
    public int chalkReplacer(int[] chalk, int k) {

        // 求和 sum
        long sum = 0l;
        for (int i = 0; i < chalk.length; ++i) {
            sum += (long)chalk[i];
        }

        // k 对 sum 取余，得到余数 n
        int n = (int)(k % sum);

        // 判断是第几个同学
        for (int i = 0; i < chalk.length; ++i) {
            n -= chalk[i];
            if (n < 0) return i;
        }
        return -1;
    }
}
package com.lhl.leetcode.findTheStudentThatWillReplaceTheChalk;

// 简单遍历循环
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        while (true) {
            for (int i = 0; i < chalk.length; ++i) {
                k -= chalk[i];
                if (k < 0) return i;
            }
        }
    }
}
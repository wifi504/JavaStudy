package com.lhl.leetcode.makeSumDivisibleByP;

// 丑陋的2273ms
class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long sum[] = new long[n + 1];

        // 计算和
        sum[0] = 0l;
        for (int i = 0; i < n; ++i) {
            sum[i + 1] = sum[i] + nums[i];
        }

        // 如果恰好能走，返回0
        if (sum[sum.length - 1] % p == 0) return 0;

        // 遍历查找走多少次
        for (int i = 1; i < sum.length; ++i) {
            for (int j = 0; j < sum.length - i; ++j) {
                long temp = sum[sum.length - 1] - (sum[j + i] - sum[j]);
                if (temp != 0 && temp % p == 0) return i;
            }
        }
        return -1;
    }
}
package com.lhl.leetcode.twoSum;

// 初次提交
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int add = -1;
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                add = nums[i] + nums[j];
                if (add == target && i != j) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }

        return arr;
    }
}
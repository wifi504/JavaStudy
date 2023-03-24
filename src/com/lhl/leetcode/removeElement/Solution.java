package com.lhl.leetcode.removeElement;

class Solution {
    public int removeElement(int[] nums, int val) {
        // 计算共有多少个等于val的值
        int count = 0;
        for (int i = 0; i < nums.length; ++i) {
            count += nums[i] == val ? 1 : 0;
        }
        // System.out.println("====传入的数组====");
        // print(nums);

        // 循环 count 次
        // 设 index = length - 1 , 把等于 val 的依次放最后
        int index = nums.length - 1;
        // 遍历数组查找 val
        for (int i = 0; i < count; ++i) {
            for (int j = 0; j < nums.length - count; ++j) {
                if (nums[j] == val) {
                    nums[j] = nums[index];
                    nums[index] = val;
                    --index;
                    break;
                }
            }
        }
        // System.out.println("====改变顺序后的数组====");
        // print(nums);
        return nums.length - count;
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
package com.lhl.leetcode.medianOfTwoSortedArrays;

// 优化
class Solution1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // print(nums1);
        // print(nums2);
        // 合并数组
        int[] arr = new int[nums1.length + nums2.length];
        int index = 0;
        for (int i = 0; i < nums1.length; ++i) {
            arr[index] = nums1[i];
            ++index;
        }
        for (int i = 0; i < nums2.length; ++i) {
            arr[index] = nums2[i];
            ++index;
        }
        // print(arr);

        // 排序数组
        int temp = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - i - 1; ++j) {
                if (arr[j] <= arr[j + 1]) {
                    continue;
                } else {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // print(arr);

        return findMid(arr);


    }

    // 查找中位数
    public double findMid(int[] arr) {
        if (arr.length % 2 == 0) {
            int n1 = arr.length / 2;
            int n2 = n1 + 1;
            return (arr[n1 - 1] + arr[n2 - 1]) / 2.0;
        } else {
            return arr[(arr.length - 1) / 2];
        }
    }

    // 打印数组
    public void print(int[] arr) {
        System.out.println("======数组打印如下======");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
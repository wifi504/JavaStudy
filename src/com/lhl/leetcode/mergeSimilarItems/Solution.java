package com.lhl.leetcode.mergeSimilarItems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        // 获取所有价值
        int allItems = items1.length + items2.length;
        int[] values = new int[allItems];
        for (int i = 0; i < allItems; ++i) {
            if (i < items1.length) {
                values[i] = items1[i][0];
            } else {
                values[i] = items2[i - items1.length][0];
            }
        }

        // System.out.println("====values====");
        // print(values);

        // 移除所有重复价值
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < values.length; i++) {
            set.add(values[i]);
        }
        int[] newValues = new int[set.size()];
        int index = 0;
        for (int i : set) {
            newValues[index++] = i;
        }

        // System.out.println("====newValues====");
        // print(newValues);

        //排序
        for (int i = 0; i < newValues.length - 1; ++i) {
            for (int j = 0; j < newValues.length - 1 - i; ++j) {
                if (newValues[j] > newValues[j + 1]) {
                    int temp = newValues[j];
                    newValues[j] = newValues[j + 1];
                    newValues[j + 1] = temp;
                }
            }
        }

        // System.out.println("====排序后的newValues====");
        // print(newValues);

        // 合并 items1 和 2
        int[][] ret = new int[newValues.length][2];
        for (int i = 0; i < newValues.length; ++i) {
            for (int j = 0; j < items1.length; ++j) {
                if (newValues[i] == items1[j][0]) {
                    ret[i][0] = newValues[i];
                    ret[i][1] += items1[j][1];
                }
            }
        }
        for (int i = 0; i < newValues.length; ++i) {
            for (int j = 0; j < items2.length; ++j) {
                if (newValues[i] == items2[j][0]) {
                    ret[i][0] = newValues[i];
                    ret[i][1] += items2[j][1];
                }
            }
        }

        // System.out.println("====合并的ret====");
        // print(ret);

        List<List<Integer>> list = new ArrayList<>();

        for (int[] innerArray : ret) {
            List<Integer> innerList = new ArrayList<>();
            for (int element : innerArray) {
                innerList.add(element);
            }
            list.add(innerList);
        }

        return list;

    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("; ");
        }
        System.out.println();
    }
}
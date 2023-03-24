package com.lhl.leetcode.minimumRecolorsToGetKConsecutiveBlackBlocks;

class Solution {
    public int minimumRecolors(String blocks, int k) {
        // 滑动窗口解法
        //定义变量，窗口左边界、右边界，W计数，返回值
        int left = 0, right = 0, count = 0, res = 0;

        // 初始化窗口大小以及W计数
        while (right < k && right < blocks.length()) {
            count += blocks.charAt(right) == 'W' ? 1 : 0;
            System.out.printf("left=%d right=%d count=%d res=%d\n",left,right,count,res);
            ++right;
        }
        --right;
        System.out.println("=======");
        System.out.printf("left=%d right=%d count=%d res=%d\n",left,right,count,res);
        if (right + 1 == blocks.length()) return count;

        // 更新窗口内W的计数并将最小值赋给res
        res = count;
        while (right < blocks.length() - 1) {
            ++left;
            ++right;
            count += blocks.charAt(right) == 'W' ? 1 : 0;
            count -= blocks.charAt(left - 1) == 'W' ? 1 : 0;
            res = Math.min(res, count);
            System.out.printf("left=%d right=%d count=%d res=%d\n",left,right,count,res);
        }
        return res;

    }
}
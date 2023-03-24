package com.lhl.leetcode.liWuDeZuiDaJieZhiIcof;

/*
	在一个 m*n 的棋盘的每一格都放有一个礼物，
	每个礼物都有一定的价值（价值大于 0）。
	你可以从棋盘的左上角开始拿格子里的礼物，
	并每次向右或者向下移动一格、直到到达棋盘的右下角。
	给定一个棋盘及其上面的礼物的价值，
	请计算你最多能拿到多少价值的礼物？
*/


// 以下为暴力递归解法
public class FindMaxGift {

	public static void main(String[] args){
		Tools myTools = new Tools();

		int[][] gifts = {{3,8,6,0,5,9,9,6,3,4,0,5,7,3,9,3},{0,9,2,5,5,4,9,1,4,6,9,5,6,7,3,2},{8,2,2,3,3,3,1,6,9,1,1,6,6,2,1,9},{1,3,6,9,9,5,0,3,4,9,1,0,9,6,2,7},{8,6,2,2,1,3,0,0,7,2,7,5,4,8,4,8},{4,1,9,5,8,9,9,2,0,2,5,1,8,7,0,9},{6,2,1,7,8,1,8,5,5,7,0,2,5,7,2,1},{8,1,7,6,2,8,1,2,2,6,4,0,5,4,1,3},{9,2,1,7,6,1,4,3,8,6,5,5,3,9,7,3},{0,6,0,2,4,3,7,6,1,3,8,6,9,0,0,8},{4,3,7,2,4,3,6,4,0,3,9,5,3,6,9,3},{2,1,8,8,4,5,6,5,8,7,3,7,7,5,8,3},{0,7,6,6,1,2,0,3,5,0,8,0,8,7,4,3},{0,4,3,4,9,0,1,9,7,7,8,6,4,6,9,5},{6,5,1,9,9,2,2,7,4,2,7,2,2,3,7,2},{7,1,9,6,1,2,7,0,9,6,6,4,4,5,1,0},{3,4,9,2,8,3,1,2,6,9,7,0,2,4,2,0},{5,1,8,8,4,6,8,5,2,4,1,6,2,2,9,7}};
		int gift = myTools.maxValue(gifts);
		System.out.println(gift);

		
	}
}

class Tools {
	public int maxValue(int[][] grid) {
        return findMax(grid, 0, 0);
    }

    // 输入数组、所在点行列 i j ，返回该点能取得的最大值礼物
    public int findMax(int[][] arr, int i, int j) {

        // 总行 x , 总列 y
        int x = arr.length;
        int y = arr[0].length;

        // 只能拿右方和下方礼物，如果到最右边界和最下边界，则取得整列或整行
        if (i == x - 1 && j == y - 1) {
            // 到达右下角，返回自己并退出
            return arr[i][j];
        } else if (i == x - 1) {
            // 到达最下边界，返回自己和剩余行
            int temp = 0;
            for (int k = j; k < y; ++k) {
                temp += arr[x - 1][k];
            }
            return temp;
        } else if (j == y - 1) {
            // 到达最右边界，返回自己和剩余列
            int temp = 0;
            for (int k = i; k < x; ++k) {
                temp += arr[k][y - 1];
            }
            return temp;
        } else {
            // 在棋盘内部，返回自己和最大相邻
            int right = findMax(arr, i, j + 1);
            int bottom = findMax(arr, i + 1, j);
            return arr[i][j] + Math.max(right, bottom);
        }
    }
}
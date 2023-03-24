package com.lhl.javaCode;

// 老鼠出迷宫

public class MiGong {

	public static void main(String[] args) {

		Tools myTools = new Tools();

		// 定义地图 9行8列 , 边界1
		// 地图： 0 空  1 边界障碍物  2 可以走的路  3 走不了的路
		int[][] map = new int[8][7];

		for (int i = 0; i < map[i].length; ++i) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		for (int i = 0; i < map.length; ++i) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1;

		System.out.println("========当前地图如下========");
		myTools.print(map);

		// 开始寻路
		myTools.findWay(map, 1, 1);
		System.out.println("\n========寻路结果如下========");
		myTools.print(map);
	}
}

class Tools {

	// 打印二维数组
	public void print(int arr[][]) {
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 寻路
	public boolean findWay(int map[][], int i, int j) {

		if (map[6][5] == 2) {
			return true;
		} else {
			if (map[i][j] == 0) {
				map[i][j] = 2;
				if (findWay(map, i + 1, j)) {
					return true;
				} else if (findWay(map, i, j + 1)) {
					return true;
				} else if (findWay(map, i - 1, j)) {
					return true;
				} else if (findWay(map, i, j - 1)) {
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
			} else {
				return false;
			}
		}
	}
}
package com.lhl.javaCode;

public class EightQueens {

	public static void main(String[] args) {

		// 八皇后问题递归解法

		// 定义一个 8*8 棋盘，0表示空位，1表示皇后位置
		int[][] map = new int[8][8];
		Tools1 myTools = new Tools1();
		System.out.println("=====初始化棋盘如下=====");
		myTools.print(map);
		myTools.findPoint(map, 0, 0);
		System.out.println("\n=====找点后棋盘如下=====");
		myTools.print(map);
	}
}

class Tools1 {

	// 给皇后定位 0表示空位，1表示皇后可以在的位置，2表示不能在的位置
	public boolean findPoint(int[][] map, int i, int j) {
		if (map[i][j] == 0) {
			map[i][j] = 1;
			if (findPoint(map, i + 1, j)) {
				if (findPoint(map, i, j + 1)) {
					// =========判断开始==========
					int count = 0, x = 0, y = 0, num = 0;
					// 竖直方向成立
					count = 0;
					for (int a = 0; a < map.length; a++) { //循环次数为行数
						if (map[i][j] == map[a][j]) {
							count++;
						}
					}
					boolean isShuZhiOk = count == 1; 
					// 水平方向成立
					count = 0;
					for (int a = 0; a < map[i].length; a++) { // 循环次数为列数
						if (map[i][j] == map[i][a]) {
							count++;
						}
					}
					boolean isShuiPingOk = count == 1;
					// 左上右下方向成立，需要置零且判断循环次数 num 
					count = 0;
					num = 0;
					x = i;
					y = j;
					while (true) {
						if (x == y) {
							num = map.length;
							break;
						} else if (y == 0){
							num = map.length - x;
							break;
						} else if (x == 0) {
							num = map.length - y;
							break;
						}
						x--;
						y--;
					}
					for (int a = 0; a < num; a++) { // 循环次数为num
						if (map[i][j] == map[x + a][y + a]) {
							count++;
						}
					}
					boolean isZuoShangOk = count == 1; 
					// 左下右上方向成立，需要置零且判断循环次数 num 
					count = 0;
					num = 0;
					x = i;
					y = j;
					while (true) {
						if ((x + y) == map.length - 1) {
							num = map.length;
							break;
						} else if (y == map.length - 1){
							num = map.length - x;
							break;
						} else if (x == 0) {
							num = y + 1;
							break;
						}
						x--;
						y++;
					}
					for (int a = 0; a < num; a++) { // 循环次数为num
						if (map[i][j] == map[x + a][y - a]) {
							count++;
						}
					}
					boolean isZuoXiaOk = count == 1; 
					// =========判断结束==========
					if (isShuZhiOk && isShuiPingOk && isZuoShangOk && isZuoXiaOk) {
						return true;
					} else {
						map[i][j] = 2;
						return false;
					}
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	// 打印二维数组
	public void print(int arr[][]) {
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}


}
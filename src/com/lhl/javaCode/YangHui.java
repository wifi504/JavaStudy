package com.lhl.javaCode;

public class YangHui {
	
	public static void main(String[] args){
	
		/*
		打印10行杨辉三角
		1 
		1	1
		1	2	1
		1	3	3	1
		1	4	6	4	1
		...
		*/

		// 定义初始数组
		int[][] yangHui = new int[10][];
		// 定义组合数变量
		int cFenZi = 1;	// 分子
		int cFenMu = 1;	// 分母
		int temp = 1;	// 临时变量
		int count = 0;	// 计数器


		for (int i = 0; i < yangHui.length; ++i) {
			// 初始化一维数组
			yangHui[i] = new int[i + 1];
			// 数组赋值
			for (int j = 0; j < yangHui[i].length; ++j) {
				if (j == 0 || j == yangHui[i].length - 1) {
					yangHui[i][j] = 1;
				} else {
					// 计算分子
					temp = i;
					for (count = 0; count < j; ++count) {
						cFenZi *= temp;
						--temp;
					}
					// 计算分母
					temp = j;
					for (count = 0; count < j; ++count) {
						cFenMu *= temp;
						--temp;
					}
					// 计算组合数并赋值
					yangHui[i][j] = cFenZi / cFenMu;
					// 重置变量
					cFenZi = 1;
					cFenMu = 1;

					// 其实可以一句话搞定：
					// yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
				}
			}
		}

		// 打印杨辉三角
		// 打印行
		for (int x = 0; x < yangHui.length; ++x) {
			// 打印列
			for (int y = 0; y < yangHui[x].length; ++y) {
				System.out.print(yangHui[x][y] + "\t");
			}
			System.out.println();
		}



	}
}
package com.lhl.javaCode;

import java.util.Scanner;
public class LingXing {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		//判断输入并将正确的高存入 height
		int height = 0;
		while(true){
			System.out.print("请输入菱形的高(Int类型整数)：");
			int inputHeight = myScanner.nextInt();
			if (inputHeight < 0) {
				System.out.println("请输入正整数!：");
			} else {
				if (inputHeight % 2 == 0) {
					height = inputHeight + 1;
					System.out.println("你输入的是一个偶数\"" + inputHeight 
						+ "\"，将打印一个高为\"" + height + "\"的菱形");
					break;
				} else {
					height = inputHeight;
					System.out.println("你输入的是一个奇数\"" + inputHeight 
						+ "\"，将打印一个高为\"" + height + "\"的菱形");
					break;
				}
			}
		}
		int weightStart = (height + 1) / 2;  // 字符数起始值
		int weight = weightStart;
		// 打印行
		for(int i = 1; i <= height; i++){
			// 打印列
			for(int k = 1; k <= weight; k++){
				// 判断何列为*
				if(k == weight || k == height - weight + 1){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
			// 控制每行多少列
			if(i < weightStart){
				weight += 1;
			} else {
				weight -= 1;
			}
		}
	}
}
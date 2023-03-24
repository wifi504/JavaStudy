package com.lhl.javaCode;

import java.util.Scanner;

public class SanJiao {

	public static void main(String[] args){

		Scanner myScanner = new Scanner(System.in);
		
		//判断输入并将正确的高存入 height
		while(true){
			System.out.print("请输入菱形的高：");
			int inputHeight = myScanner.nextInt();
			int height = 0;
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

		//


	}
}
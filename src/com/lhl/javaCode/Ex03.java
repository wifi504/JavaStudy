package com.lhl.javaCode;

import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		MyTools mt = new MyTools();
		// 判断奇偶数
		System.out.print("请输入一个int类型整数：");
		int num = input.nextInt();
		System.out.println(mt.isOdd(num));


	}
}

class MyTools {

	public boolean isOdd(int n) {

		if (n % 2 != 0) {
			return true;
		} else {
			return false;
		}

		// return n % 2 != 0;
		// return n % 2 != 0 ? true : false;
	}
}
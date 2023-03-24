package com.lhl.javaCode;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args){

		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入年份： ");
		int year = myScanner.nextInt();
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.print("是闰年！");
		} else {
			System.out.print("不是闰年！");
		}
		
	}
}
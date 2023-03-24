package com.lhl.javaCode;

import java.util.Scanner;

public class If01 {

	public static void main(String[] ergs){

		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入第一个数： ");
		double num1 = myScanner.nextInt();
		System.out.print("请输入第二个数： ");
		double num2 = myScanner.nextInt();

		if(num1 > 10 && num2 < 20){
			System.out.println("两数之和为: " + (num1 + num2));
		}
	}
}
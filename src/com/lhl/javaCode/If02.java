package com.lhl.javaCode;

import java.util.Scanner;

public class If02 {

	public static void main(String[] ergs){

		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入第一个数： ");
		int num1 = myScanner.nextInt();
		System.out.print("请输入第二个数： ");
		int num2 = myScanner.nextInt();
		// 求和
		int numAdd = num1 + num2;
		if((numAdd % 3) == 0 && (numAdd % 5) == 0){
			System.out.println("两数之和能被3、5整除！");
		}
	}
}
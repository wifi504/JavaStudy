package com.lhl.javaCode;

import java.util.Scanner;

public class Sm_Big {

	public static void main(String[] args){

		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入小写字母：");
		char inputChar = myScanner.next().charAt(0);

		switch(inputChar){

			case 'a' : 
				System.out.println("A");
				break;
			case 'b' : 
				System.out.println("B");
				break;
			case 'c' : 
				System.out.println("C");
				break;
			case 'd' : 
				System.out.println("D");
				break;
			case 'e' : 
				System.out.println("E");
				break;
			default : 
				System.out.println("other");
				break;
		}
	}
}
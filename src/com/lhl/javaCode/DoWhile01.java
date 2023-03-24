package com.lhl.javaCode;

public class DoWhile01 {

	public static void main(String[] args){

		int i = 1;
		do {
			if (i % 5 == 0 && i % 3 != 0) {
				System.out.println("i = " + i);
			}
			i++;
		} while(i <= 200);
	}
}
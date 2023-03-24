package com.lhl.javaCode;

public class Comput {

	public static void main(String[] args){
		
		double i = 0.5;
		double add = 0;
		int n = 0;
		while(n < 10000){

			add += Math.pow(i, n);
			++n;
		}
		System.out.println(add);
	}
}
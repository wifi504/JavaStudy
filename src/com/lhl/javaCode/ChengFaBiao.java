package com.lhl.javaCode;

public class ChengFaBiao {

	public static void main(String[] args) {

		for (int j = 1; j <= 9; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.print("\n");
		}

	}
}
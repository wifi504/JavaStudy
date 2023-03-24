package com.lhl.javaCode;

public class RecursionTest {
	
	public static void main(String[] args) {
		
		// 求出斐波那契数列的第 n 个值
		// 1 1 2 3 5 8 13 21

		int n = 100; // 输入n
		T1 tool = new T1();
		System.out.println("n=" + n + " return=" + tool.fb(n));

	}
}

class T1 {

	public int fb(int n) {

		// 递归计算
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fb(n - 1) + fb(n - 2);
		}
	}
}
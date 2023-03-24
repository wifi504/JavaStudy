package com.lhl.javaCode;

public class MonkeyEatPeach {
	
	public static void main(String[] args) {
		
		// 猴子吃桃，猴子每天吃一半的桃子再多吃一个，第十天只剩一个，最开始有多少桃子
		
		// 第m天剩n个
		int m = 10;
		int n = 1;
		T t = new T();
		System.out.println("最开始有" + t.eat(m, n) + "个桃子！");

	}
}

class T {

	public int eat(int m, int n) { // 第m天剩n个

		if ( m == 1) {
			return n;
		} else {
			return eat(m-1, (n + 1) * 2);
		}
	}
}
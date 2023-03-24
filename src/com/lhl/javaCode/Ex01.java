package com.lhl.javaCode;

/*
	某人有 100,000 元,每经过一次路口，需要交费,规则如下:
	1)当现金 > 50000 时,每次交 5 %
	2)当现金 <= 50000 时,每次交 1000

	编程计算该人可以经过多少次路口，要求:使用 while break方式完成
*/

public class Ex01 {

	public static void main(String[] args){

		double money = 100000; // 人拥有的资金
		int i = -1; // 通过路口次数
		while(true){
			if (money <= 50000) {
				money -= 1000;
			} else {
				money *= .95;
			}
			i++;
			if (money < 0) {
				break;
			}
		}
		System.out.println("该人可以经过" + i + "次路口");
	}
}
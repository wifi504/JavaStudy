package com.lhl.javaCode;

public class Array01 {

	public static void main(String[] args){

		int arry[] = {8,9,5,3,6,100,5,22,44,66,22,58,12};
		int max = arry[0];
		int maxIndex = 0;
		for (int i = 0; i < arry.length; i++) {
			if (max < arry[i]) {
				max = arry[i];
				maxIndex = i;
			}
		}
		System.out.println("最大值是 " + max + " ，位于第" + (maxIndex + 1) + "个");
	}
}
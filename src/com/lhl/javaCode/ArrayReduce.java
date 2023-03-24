package com.lhl.javaCode;

import java.util.Scanner;
public class ArrayReduce {
	
	public static void main(String[] args){
	
		// 定义一个初始数组
		int arr[] = {2,4,5,3,7,5};
		
		Scanner input = new Scanner(System.in);
		System.out.println("当前数组为：");
		
		// 打印数组
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		while(true){
			System.out.println("\n是否要缩减该数组？(y/n)");
			char answer = input.next().charAt(0);
			if(answer == 'n' || arr.length == 1){
				System.out.println("用户结束或数组只剩一个元素，程序退出，当前数组为：");
				for(int i = 0; i < arr.length; i++){
					System.out.print(arr[i] + "\t");
				}
				break;
			} else {
				// 数组缩减
				int newArry[] = new int[arr.length - 1];
				for(int i = 0; i < newArry.length; i++){
					newArry[i] = arr[i];
				}
				arr = newArry;
				System.out.println("已缩减一个元素，当前数组为：");
				for(int i = 0; i < arr.length; i++){
					System.out.print(arr[i] + "\t");
				}
			}
		}
	}
}
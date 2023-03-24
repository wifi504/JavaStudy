package com.lhl.javaCode;

// 冒泡排序
public class BubbleSort {
	
	public static void main(String[] args){
	
		// 定义待排序数组
		int[] arr = {24, 69, 80, 57, 13, 47, 99, 65, 12};
		// 定义临时变量
		int temp = 0;

		// 外轮排序，每 i 轮将第 i 大的数放在倒数第 i 个
		// 共需排序 (元素总数 - 1) 次
		for (int i = 0; i < (arr.length - 1); ++i) {
			// 内层比较，共比较 (元素总数 - i - 1) 次
			for (int j = 0; j < (arr.length - i - 1); ++j) {
				// 进行两两比较
				if (arr[j] < arr[j + 1]) {
					continue;
				} else {
					//元素交换
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				System.out.print("第" + (i + 1) + "轮排序\t第" + (j + 1) + "次比较：\t");
				for (int len = 0; len < arr.length; ++len) {
					System.out.print(arr[len] + "  ");
				}
				System.out.println();
			}
		}




	}
}
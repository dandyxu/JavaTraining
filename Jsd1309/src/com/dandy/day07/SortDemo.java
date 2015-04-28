package com.dandy.day07;

import java.util.Arrays;

public class SortDemo {

	/**
	 * 选择排序
	 */
	public static void main(String[] args) {
		int[] ary = { 8, 3, 5, 1, 4, 2, 7 };
		// selectSort(ary);
		bubbleSort(ary);
		System.out.println(Arrays.toString(ary));
	}

	public static void selectSort(int[] ary) {
		for (int i = 0; i < ary.length - 1; i++) { // i最多取到length-2位
			for (int j = i + 1; j < ary.length; j++) { // j最多取到length-1位
				if (ary[i] > ary[j]) {
					int temp = ary[j];
					ary[j] = ary[i];
					ary[i] = temp;
				}
			}

		}

	}

	public static void bubbleSort(int[] ary) {
		for (int i = 0; i < ary.length - 1; i++) {               //i的值没有联系，i只表示循环的轮数，j是数组元素的下标
			for (int j = 0; j < ary.length - 1 - i; j++) {       //经过一轮比较之后，就拿出一个数
				if (ary[j] > ary[j+1]) {
					int temp = ary[j];
					ary[j] = ary[j + 1];
					ary[j + 1] = temp;
				}

			}
		}
	}

}

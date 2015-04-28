package com.dandy.day07;

import java.util.Arrays;

public class SortDemo {

	/**
	 * ѡ������
	 */
	public static void main(String[] args) {
		int[] ary = { 8, 3, 5, 1, 4, 2, 7 };
		// selectSort(ary);
		bubbleSort(ary);
		System.out.println(Arrays.toString(ary));
	}

	public static void selectSort(int[] ary) {
		for (int i = 0; i < ary.length - 1; i++) { // i���ȡ��length-2λ
			for (int j = i + 1; j < ary.length; j++) { // j���ȡ��length-1λ
				if (ary[i] > ary[j]) {
					int temp = ary[j];
					ary[j] = ary[i];
					ary[i] = temp;
				}
			}

		}

	}

	public static void bubbleSort(int[] ary) {
		for (int i = 0; i < ary.length - 1; i++) {               //i��ֵû����ϵ��iֻ��ʾѭ����������j������Ԫ�ص��±�
			for (int j = 0; j < ary.length - 1 - i; j++) {       //����һ�ֱȽ�֮�󣬾��ó�һ����
				if (ary[j] > ary[j+1]) {
					int temp = ary[j];
					ary[j] = ary[j + 1];
					ary[j + 1] = temp;
				}

			}
		}
	}

}

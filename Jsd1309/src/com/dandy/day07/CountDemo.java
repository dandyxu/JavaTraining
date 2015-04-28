package com.dandy.day07;

import java.util.Arrays;

public class CountDemo {

	/**
	 * "12312341123"��ÿ���ַ���ȡ������char���ͽ��бȽ� ƥ����ҵ����ϵ��ַ�λ�ã����ظ�λ��
	 */
	public static void main(String[] args) {
		int[] all = count("a2aaasd1231aafqwer", 'a');
		System.out.println(Arrays.toString(all));
	}

	public static int[] count(String str, char ch) {
		int[] ary = new int[0];
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (ch == c) {
				ary = Arrays.copyOf(ary, ary.length + 1); // newһ������Ϊ0�����飬����������ݣ�
				ary[ary.length - 1] = i; // ���ƥ���������򽫸��α긳���������Ϊ0�����飬����length-1λ
			}
		}
		return ary;

	}

}

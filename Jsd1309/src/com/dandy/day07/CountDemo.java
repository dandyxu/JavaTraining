package com.dandy.day07;

import java.util.Arrays;

public class CountDemo {

	/**
	 * "12312341123"中每个字符都取出，和char类型进行比较 匹配后找到符合的字符位置，返回该位置
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
				ary = Arrays.copyOf(ary, ary.length + 1); // new一个长度为0的数组，对其进行扩容，
				ary[ary.length - 1] = i; // 如果匹配条件，则将该游标赋给这个长度为0的数组，赋给length-1位
			}
		}
		return ary;

	}

}

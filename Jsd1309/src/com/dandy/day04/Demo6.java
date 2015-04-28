package com.dandy.day04;

import java.util.Scanner;

public class Demo6 {
	/**
	 * This Demo demonstrates a program which function is to figure out whether
	 * a letter is lower or not.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入一个字母：");
			String s = sc.nextLine(); // 逐行读取string里的字符串
			if (s.length() == 1) {
				char c = s.charAt(0); // 需要将string类型转换成char类型，这样才能和ASCII码比较
				if (c >= 'a' && c <= 'z') {
					System.out.println(s
							+ " is a lower letter，Congratulations！");
				} else {
					System.out.println(s + "不是一个小写字母！");
				}
			} else {
				System.out.println("没文化真可怕！");
			}
		}

	}

}

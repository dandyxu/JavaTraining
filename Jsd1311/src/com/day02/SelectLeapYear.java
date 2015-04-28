package com.day02;

import java.util.Scanner;

public class SelectLeapYear {

	/**
	 * 判断闰年
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入年数：");
			int year = sc.nextInt();
			if (year % 4 == 0 && year % 100 != 0) {
				System.out.println(year + " 是闰年！");
				continue;
			} else if (year % 400 == 0) {
				System.out.println(year + " 是闰年！");
				continue;
			} else {
				System.out.println(year + " 不是闰年");
				continue;
			}
		}

	}

}

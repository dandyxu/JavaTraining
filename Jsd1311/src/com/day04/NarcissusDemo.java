package com.day04;

import java.util.Scanner;

public class NarcissusDemo {

	/**
	 * 水仙花数 即一个整数满足其值等于各个数位的立方和 153 = 1^3+5^3+3^3
	 */
	public static void main(String[] args) {
		int hundruds, decade, unit = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您想计算的n位以内的水仙花数：");
		int cmd = sc.nextInt();
		for (int i = 0; i <= cmd; i++) {
			hundruds = i / 100;
			decade = i / 10 % 10;
			unit = i % 10;
			if (i == hundruds * hundruds * hundruds + decade * decade * decade
					+ unit * unit * unit) {
				System.out.println(i + "是水仙花数！");
			}

		}

	}

}

package com.day03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SumArray {

	/**
	 * 求调和函数的和 已知数列：an=1/n (1,2,3...n) 求和：a1+a2+...+an 即：1/1+1/2+...+1/n
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您想计算的数列n的值：");
		int cmd = sc.nextInt();
		DecimalFormat df = new DecimalFormat("0.000");
		double sum = 0;
		for (int n = 1; n <= cmd; n++) {
			sum += 1.0 / n;
			// System.out.println(sum + "是n=" + n + "数列的和");
		}
		System.out.println(df.format(sum) + "是n=" + cmd + "数列的和");

	}

}

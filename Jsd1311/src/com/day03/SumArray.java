package com.day03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SumArray {

	/**
	 * ����ͺ����ĺ� ��֪���У�an=1/n (1,2,3...n) ��ͣ�a1+a2+...+an ����1/1+1/2+...+1/n
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������������n��ֵ��");
		int cmd = sc.nextInt();
		DecimalFormat df = new DecimalFormat("0.000");
		double sum = 0;
		for (int n = 1; n <= cmd; n++) {
			sum += 1.0 / n;
			// System.out.println(sum + "��n=" + n + "���еĺ�");
		}
		System.out.println(df.format(sum) + "��n=" + cmd + "���еĺ�");

	}

}

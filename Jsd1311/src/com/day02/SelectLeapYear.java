package com.day02;

import java.util.Scanner;

public class SelectLeapYear {

	/**
	 * �ж�����
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("������������");
			int year = sc.nextInt();
			if (year % 4 == 0 && year % 100 != 0) {
				System.out.println(year + " �����꣡");
				continue;
			} else if (year % 400 == 0) {
				System.out.println(year + " �����꣡");
				continue;
			} else {
				System.out.println(year + " ��������");
				continue;
			}
		}

	}

}

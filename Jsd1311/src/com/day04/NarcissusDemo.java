package com.day04;

import java.util.Scanner;

public class NarcissusDemo {

	/**
	 * ˮ�ɻ��� ��һ������������ֵ���ڸ�����λ�������� 153 = 1^3+5^3+3^3
	 */
	public static void main(String[] args) {
		int hundruds, decade, unit = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("��������������nλ���ڵ�ˮ�ɻ�����");
		int cmd = sc.nextInt();
		for (int i = 0; i <= cmd; i++) {
			hundruds = i / 100;
			decade = i / 10 % 10;
			unit = i % 10;
			if (i == hundruds * hundruds * hundruds + decade * decade * decade
					+ unit * unit * unit) {
				System.out.println(i + "��ˮ�ɻ�����");
			}

		}

	}

}

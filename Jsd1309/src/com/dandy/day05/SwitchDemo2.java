package com.dandy.day05;

import java.util.Scanner;

public class SwitchDemo2 {

	/**
	 * ��ϰ�� A ����ķ B ѩ�� W ���ϼ� H ��� ���� ζȫ ����������Ǵ�д��ĸ
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		while (true) {
			System.out.println("��ѡ����Ҫ��������ϱ�ţ�������һ����д��ĸ��");
			String s = sc.nextLine();
			if (s.length() == 1) {
				c = s.charAt(0);
				if (c <= 'Z' && c >= 'A') {
					break;
				}
			}
			System.out.println("��������");
		}
		String drink;
		switch (c) {
		case 'A':                               //value�м�ֵ�ԣ�һ��key��Ӧһ��value��JDK1.6��key����ȡString���ͣ�JDK1.7�п���
			drink = "����ķ";
			break;
		case 'B':
			drink = "ѩ��";
			break;
		case 'W':
			drink = "���ϼ�";
			break;
		case 'H':
			drink = "���";
			break;
		default:
			drink = "ζȫ";
			break;
		}
		System.out.println("���������" + c + "��" + drink);
	}
}

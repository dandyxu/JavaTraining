package com.dandy.day05;

import java.util.Scanner;

public class SwitchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		while (true) {
			System.out.println("������һ��0-100�ķ���:");
			score = sc.nextInt();
			if (score >= 0 && score <= 100) {
				break;
			}
			System.out.println("��������");
		}
		String level;
		switch (score / 10) {
		case 10:
		case 9:
			level = "����";
			break;
		case 8:
			level = "����";
			break;
		case 7:
			level = "�е�";
			break;
		case 6:
			level = "����";
			break;
		default:
			level = "������";
		}
		System.out.println("���������" + score + "��" + level);
	}
}

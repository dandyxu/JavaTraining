package com.dandy.day05;

import java.util.Random;
import java.util.Scanner;

public class GuessDemo {

	/**
	 * ��ϰ������ĸ��Ϸ ����һ����ĸ����Random������ɵ�һ����ĸ���бȽϣ���ʾ��С�������У����˳� ��5�Σ����ܽ����Σ����������
	 */
	public static void main(String[] args) {
		Random rd = new Random();
		char answer = (char) (rd.nextInt(26) + 'a');
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 5; i++) {
			if (i == 5) {
				System.out.println("������Ĵ����Ѵ�5�Σ����˳���");
				System.out.println("���ɵ������Ϊ" + answer);
				break;
			} else {
				System.out.println("������һ����ĸ��");
				String s = sc.nextLine();
				if (s.length() == 1 && s.length() != 0) {
					char c = s.charAt(0);
					if (c <= 'z' && c >= 'a') {
						if (c < answer) {
							System.out.println("����С�ˣ�");
						} else if (c > answer) {
							System.out.println("���´��ˣ�");
						} else {
							System.out.println("��ϲ�������¶��ˣ�");
							break;
						}
					} else {
						System.out.println("����Ĳ���Сд��ĸ��");
					}

				} else {
					System.out.println("û�Ļ�����£�");
				}
			}

		}

	}

}

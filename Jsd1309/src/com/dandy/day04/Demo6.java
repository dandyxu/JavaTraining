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
			System.out.println("������һ����ĸ��");
			String s = sc.nextLine(); // ���ж�ȡstring����ַ���
			if (s.length() == 1) {
				char c = s.charAt(0); // ��Ҫ��string����ת����char���ͣ��������ܺ�ASCII��Ƚ�
				if (c >= 'a' && c <= 'z') {
					System.out.println(s
							+ " is a lower letter��Congratulations��");
				} else {
					System.out.println(s + "����һ��Сд��ĸ��");
				}
			} else {
				System.out.println("û�Ļ�����£�");
			}
		}

	}

}

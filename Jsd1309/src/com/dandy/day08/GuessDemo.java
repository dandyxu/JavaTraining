package com.dandy.day08;

import java.util.Random;
import java.util.Scanner;

public class GuessDemo {

	/**
	 * 
	 */
	public static void main(String[] args) {
		char[] answers;// ϵͳ���ɵĴ�
		char[] input; // �û�����Ĵ�
		int[] result; // [0]ƥ���ַ������� [1]ƥ��λ�õ�����
		int score = 0; // ��ʾ�²�Ĵ���
		answers = getAnswers(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("�ף���ӭ�μ����ǵ���Ϸ��");
		while (true) {
			System.out.print("�°ɣ��������");
			String str = sc.nextLine();
			if ("exit".endsWith(str)) {
				System.out.println("�����㣡No courage!");
				break;
			}
			input = str.toCharArray();
			result = checkUserAnswer(input, answers);
			score++;
			if (result[0] == 5 && result[1] == 5) {
				System.out.println("Of Good!");
				break;
			} else {
				System.out.println("����" + score + "�Σ�" + "������" + result[0]
						+ "���ַ���ƥ��λ��Ϊ" + result[1]);
			}
		}

	}

	private static int[] checkUserAnswer(char[] input, char[] answers) {
		int[] result = { 0, 0 }; // Ҳ������int[] result=new int[2];
		for (int i = 0; i < answers.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (answers[i] == input[j]) {
					result[0]++;
					if (i == j) {
						result[1]++;
					}
				}

			}
		}

		return result;

	}

	private static char[] getAnswers(int i) {
		char[] chs = new char[i];
		char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		boolean[] used = new boolean[chars.length];
		Random rd = new Random();
		int index = 0;
		while (true) {
			int j = rd.nextInt(chars.length);
			if (used[j]) {
				continue;
			}
			chs[index++] = chars[j];
			used[j] = true;
			if (index == i) {
				break;
			}
		}
		return chs;
	}

}

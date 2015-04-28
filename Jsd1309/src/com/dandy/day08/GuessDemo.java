package com.dandy.day08;

import java.util.Random;
import java.util.Scanner;

public class GuessDemo {

	/**
	 * 
	 */
	public static void main(String[] args) {
		char[] answers;// 系统生成的答案
		char[] input; // 用户输入的答案
		int[] result; // [0]匹配字符的数量 [1]匹配位置的数量
		int score = 0; // 表示猜测的次数
		answers = getAnswers(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("亲，欢迎参加我们的游戏！");
		while (true) {
			System.out.print("猜吧，别客气！");
			String str = sc.nextLine();
			if ("exit".endsWith(str)) {
				System.out.println("鄙视你！No courage!");
				break;
			}
			input = str.toCharArray();
			result = checkUserAnswer(input, answers);
			score++;
			if (result[0] == 5 && result[1] == 5) {
				System.out.println("Of Good!");
				break;
			} else {
				System.out.println("猜了" + score + "次，" + "猜中了" + result[0]
						+ "个字符，匹配位置为" + result[1]);
			}
		}

	}

	private static int[] checkUserAnswer(char[] input, char[] answers) {
		int[] result = { 0, 0 }; // 也可以是int[] result=new int[2];
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

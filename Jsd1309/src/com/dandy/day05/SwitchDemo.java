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
			System.out.println("请输入一个0-100的分数:");
			score = sc.nextInt();
			if (score >= 0 && score <= 100) {
				break;
			}
			System.out.println("输入有误！");
		}
		String level;
		switch (score / 10) {
		case 10:
		case 9:
			level = "优秀";
			break;
		case 8:
			level = "良好";
			break;
		case 7:
			level = "中等";
			break;
		case 6:
			level = "及格";
			break;
		default:
			level = "不及格";
		}
		System.out.println("您输入的是" + score + "，" + level);
	}
}

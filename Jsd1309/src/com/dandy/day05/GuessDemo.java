package com.dandy.day05;

import java.util.Random;
import java.util.Scanner;

public class GuessDemo {

	/**
	 * 练习：猜字母游戏 输入一个字母，与Random随机生成的一个字母进行比较，提示大小，若猜中，则退出 猜5次，不管结果如何，程序均结束
	 */
	public static void main(String[] args) {
		Random rd = new Random();
		char answer = (char) (rd.nextInt(26) + 'a');
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 5; i++) {
			if (i == 5) {
				System.out.println("您输入的次数已达5次，请退出！");
				System.out.println("生成的随机数为" + answer);
				break;
			} else {
				System.out.println("请输入一个字母：");
				String s = sc.nextLine();
				if (s.length() == 1 && s.length() != 0) {
					char c = s.charAt(0);
					if (c <= 'z' && c >= 'a') {
						if (c < answer) {
							System.out.println("您猜小了！");
						} else if (c > answer) {
							System.out.println("您猜大了！");
						} else {
							System.out.println("恭喜您，您猜对了！");
							break;
						}
					} else {
						System.out.println("输入的不是小写字母！");
					}

				} else {
					System.out.println("没文化真可怕！");
				}
			}

		}

	}

}

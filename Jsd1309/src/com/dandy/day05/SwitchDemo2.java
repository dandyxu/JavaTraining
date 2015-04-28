package com.dandy.day05;

import java.util.Scanner;

public class SwitchDemo2 {

	/**
	 * 练习： A 阿萨姆 B 雪碧 W 王老吉 H 红茶 其余 味全 必须输入的是大写字母
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		while (true) {
			System.out.println("请选择你要购买的饮料编号，必须是一个大写字母：");
			String s = sc.nextLine();
			if (s.length() == 1) {
				c = s.charAt(0);
				if (c <= 'Z' && c >= 'A') {
					break;
				}
			}
			System.out.println("输入有误！");
		}
		String drink;
		switch (c) {
		case 'A':                               //value叫键值对，一个key对应一个value，JDK1.6中key不能取String类型，JDK1.7中可以
			drink = "阿萨姆";
			break;
		case 'B':
			drink = "雪碧";
			break;
		case 'W':
			drink = "王老吉";
			break;
		case 'H':
			drink = "红茶";
			break;
		default:
			drink = "味全";
			break;
		}
		System.out.println("您输入的是" + c + "，" + drink);
	}
}

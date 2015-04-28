package com.dandy.day11;

public class Question {
	String title;// 题干
	String[] options;// 选项

	public void print() {
		System.out.println(title);
		for (int i = 0; i < options.length; i++) {
			System.out.print(options[i] + "\t");
		}
		System.out.println();
	}

	public boolean check(char[] answers) { // 定义一个框架
		return false;
	}

}

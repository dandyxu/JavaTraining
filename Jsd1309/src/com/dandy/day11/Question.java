package com.dandy.day11;

public class Question {
	String title;// ���
	String[] options;// ѡ��

	public void print() {
		System.out.println(title);
		for (int i = 0; i < options.length; i++) {
			System.out.print(options[i] + "\t");
		}
		System.out.println();
	}

	public boolean check(char[] answers) { // ����һ�����
		return false;
	}

}

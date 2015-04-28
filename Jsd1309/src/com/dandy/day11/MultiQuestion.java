package com.dandy.day11;

import java.util.Arrays;

public class MultiQuestion extends Question {
	char[] answers;

	public MultiQuestion(String title, String[] options, char[] answer) {
		this.title = title;
		this.options = options;
		this.answers = answers;
	}

	public boolean check(char[] answers) { // char[] answers �Ǵ���Ĵ�
		return Arrays.equals(this.answers, answers); // this.answers�Ǳ�׼��
	}

}

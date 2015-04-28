package com.dandy.day11;

public class SingleQuestion extends Question {
	char answers;

	public SingleQuestion(String title, String[] options, char answer) {
		this.title = title;
		this.options = options;
		this.answers = answer;
	}

	@Override
	public boolean check(char[] answers) {
		if (answers == null || answers.length != 1)
			return false;
		return this.answers == answers[0];

	}
}

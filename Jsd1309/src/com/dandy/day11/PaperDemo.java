package com.dandy.day11;

import java.util.Scanner;

public class PaperDemo {

	public static void main(String[] args) {
		// ������������
		Question[] paper = new Question[2]; // or Question[] paper={null,null};
		// �������⸳ֵ��һ����ѡ��һ����ѡ
		paper[0] = new SingleQuestion("�����ǡ��ǳ��䡷�����ߣ�", new String[] { "A.�ҳ�������",
				"B.�Ƽ�����", "C.�������", "D.���þ���" }, 'A');
		paper[1] = new MultiQuestion("OPP������������", new String[] { "A.�̳�",
				"B.��̬", "C.��װ", "D.������" }, new char[] { 'A', 'B', 'C' });
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < paper.length; i++) {
			Question question = paper[i];
			question.print();
			System.out.println("���������Ĵ𰸣�");
			String str = sc.nextLine(); // ABC 'A' 'B' 'C'
			char[] userAnswers = str.toCharArray();
			if (question.check(userAnswers)) {
				System.out.println("��ţ���������ͣ�");
			} else {
				System.out.println("����Ŭ����");
			}
		}

	}

}

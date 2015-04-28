package com.dandy.day11;

import java.util.Scanner;

public class PaperDemo {

	public static void main(String[] args) {
		// 考卷，有两道题
		Question[] paper = new Question[2]; // or Question[] paper={null,null};
		// 给两道题赋值，一个单选，一个多选
		paper[0] = new SingleQuestion("以下是《星辰变》的作者？", new String[] { "A.我吃西红柿",
				"B.唐家三少", "C.天蚕土豆", "D.骷髅精灵" }, 'A');
		paper[1] = new MultiQuestion("OPP的三大特征？", new String[] { "A.继承",
				"B.多态", "C.封装", "D.构造器" }, new char[] { 'A', 'B', 'C' });
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < paper.length; i++) {
			Question question = paper[i];
			question.print();
			System.out.println("请输入您的答案：");
			String str = sc.nextLine(); // ABC 'A' 'B' 'C'
			char[] userAnswers = str.toCharArray();
			if (question.check(userAnswers)) {
				System.out.println("很牛，继续加油！");
			} else {
				System.out.println("还需努力！");
			}
		}

	}

}

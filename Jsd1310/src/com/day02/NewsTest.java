package com.day02;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class NewsTest {

	public static void main(String[] args) {
		// News n1 = new News("天晴了", "气象局");
		// News n2 = new News("高考成绩", "教育厅");
		// News n3 = new News("恒大胜了", "足球");
		Scanner sc = new Scanner(System.in);
		List<News> list = new ArrayList<News>();
		System.out.print("是否添加新闻:Y/N");
		char flg = sc.next().charAt(0);
		while (flg == 'Y') {
			System.out.print("请输入标题:");
			String title = sc.next();
			System.out.print("请输入发布人:");
			String creatN = sc.next();
			News n = new News(title, creatN);
			list.add(n);
			System.out.print("是否继续添加新闻:Y/N");
			flg = sc.next().charAt(0);

		}

		// list.add(n1);
		// list.add(n2);
		// list.add(n3);
		System.out.println("集合中共有:" + list.size());
		getList(list);
	}

	public static void getList(List lt) {
		for (int i = 0; i < lt.size(); i++) {
			News n = (News) lt.get(i);
			System.out.println(n.getTitle());

		}
	}

}

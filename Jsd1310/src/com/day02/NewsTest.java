package com.day02;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class NewsTest {

	public static void main(String[] args) {
		// News n1 = new News("������", "�����");
		// News n2 = new News("�߿��ɼ�", "������");
		// News n3 = new News("���ʤ��", "����");
		Scanner sc = new Scanner(System.in);
		List<News> list = new ArrayList<News>();
		System.out.print("�Ƿ��������:Y/N");
		char flg = sc.next().charAt(0);
		while (flg == 'Y') {
			System.out.print("���������:");
			String title = sc.next();
			System.out.print("�����뷢����:");
			String creatN = sc.next();
			News n = new News(title, creatN);
			list.add(n);
			System.out.print("�Ƿ�����������:Y/N");
			flg = sc.next().charAt(0);

		}

		// list.add(n1);
		// list.add(n2);
		// list.add(n3);
		System.out.println("�����й���:" + list.size());
		getList(list);
	}

	public static void getList(List lt) {
		for (int i = 0; i < lt.size(); i++) {
			News n = (News) lt.get(i);
			System.out.println(n.getTitle());

		}
	}

}

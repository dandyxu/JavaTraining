package com.dandy.day10;

public class PointDemo {

	public static void main(String[] args) {
		Point point = new Point(3, 4);
		// System.out.println(point.x + ":" + point.y);
		/*
		 * Random rd=new Random(); Scanner sc=new Scanner(System.in);
		 */// Random()��������û�в�������Scanner()���������в���
		Point p1 = new Point();
		p1.x = 3;
		p1.y = 4;

		Point p2 = new Point(3);
		// System.out.println(p2.x+":"+p2.y);

		// ��㵽ԭ��ľ���
		Point p3 = new Point(3, 4);
		System.out.println(p3.distance());

		// ������֮��ľ���
		Point p4 = new Point(3, 4);
		System.out.println(p4.distance(7, 7));

		// ����other��
		Point p5 = new Point(3, 4);
		Point other = new Point(7, 7);
		System.out.println(p5.distance(other)); // ��һ�ַ�ʽ
		System.out.println(p5.distance(new Point(7, 7))); // �ڶ��ַ�ʽ

	}

}

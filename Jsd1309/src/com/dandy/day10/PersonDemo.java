package com.dandy.day10;

public class PersonDemo {

	/**
	 * �ṩ��������飬��������һ���� �������Ľ����� �����������ɹ��ͺ�������˫��������
	 * ���Ͱ��£�����true,������ɹ������ʧ�ܾͷ���false
	 */
	public static void main(String[] args) {
		Person p1 = new Person(1, "�ڹ�", '��', 28, false, "320112199201060015X",
				"�������", "18762693048", "");
		Person p2 = new Person(2, "������", 'Ů', 27, false,
				"3201121992123123015X", "��ʤ������", "1876261", "");

		System.out.println(p1.name + " �� " + p2.name + "�ܷ���:" + p1.Marry(p2));
		System.out.println(p1.isMarried + p1.name + "�İ�����:" + p1.PName);
		System.out.println(p2.isMarried + p2.name + "�İ�����:" + p2.PName);

	}

}

package com.oop.day02;

public class TestOverwrite extends Shape {

	int r;

	public TestOverwrite(int x, int y, int z) {

	}

	public boolean contains(int x, int y) {

		return true;
	}

	public static void main(String[] args) {

		Shape s1 = new TestOverwrite(3, 4, 5);
		System.out.println(s1.contains(1, 1));//�˴�Ӧ���ǵ��������contains()���������Զ�����ʱȴ�Ǹ����cotains��������дʧЧ��
	}
	

}

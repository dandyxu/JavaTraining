package com.dandy.day07;

import java.util.Arrays;

import javax.swing.JFrame;

public class ArrayDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ary1; // ����һ��int���͵�����ary1
		// int ary2[]; //����һ��int���͵�����ary2�����Ƽ�ʹ��
		// ��̬��ʼ����new����ؼ��֣�
		JFrame frame = new JFrame();
		ary1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // ��̬��ʼ��
		System.out.println(Arrays.toString(ary1));
		ary1 = new int[9]; // ����һ������Ϊ9��int��������
		// ary1={1,2,3,4}; ������󣬾�̬��ʼ��ֻ����������ʱ��ʹ�ã������ܸ�ֵ
		// System.out.println(ary1);//��ӡ���������ڴ��ַ
		System.out.println(Arrays.toString(ary1));

		int[] ary2 = { 3, 4, 5, 6, 7 };
		double[] ary3 = new double[2];
		System.out.println(Arrays.toString(ary3));
		boolean[] ary4 = new boolean[3];
		System.out.println(Arrays.toString(ary4));
		char[] ary5 = new char[4]; // \u0000
		System.out.println(Arrays.toString(ary5));
		char c = '\u0000';
		System.out.println(c);
		String[] ary6 = new String[8];
		System.out.println(Arrays.toString(ary6));

		String[] ary7 = { "����3", "����4", "����2", "����" };
		int length = ary7.length; // �����������ʱ����()
		System.out.println(Arrays.toString(ary7));
		System.out.println(length);
		System.out.println(ary7[2]);
		//System.out.println(ary7[7]);    �����±�Խ���쳣
		
		

	}

}

package com.dandy.day04;

import java.util.Scanner;

public class TransportDemo {

	/**
	 * ��ϰ������̨�����빤�ʣ����ݹ���ˮƽ��ѡ��ؼҽ�ͨ���� 
	 * 8000���ϣ�����8000����ѡ��ɻ� 
	 * 5000��7999,������5000����ѡ�����
	 * 3000��4999������3000����ѡ����ͨ�� 
	 * 1500��2999������2999����ѡ������ 
	 * ������ѡ����·�ؼ�
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("�������Լ��Ĺ��ʣ�");
			int salary = sc.nextInt();
			if (salary >= 8000) {
				System.out.println("���Ĺ�����" + salary + "������ѡ��ɻ��ؼң�");
				continue;
			} else if (salary >= 5000 && salary < 7999) {
				System.out.println("���Ĺ�����" + salary + "������ѡ������ؼ�");
				continue;
			} else if (salary >= 3000 && salary < 4999) {
				System.out.println("���Ĺ�����" + salary + "������ѡ����ͨ�𳵻ؼ�");
				continue;
			} else if (salary > 1500 && salary <= 2999) {
				System.out.println("���Ĺ�����" + salary + "������ѡ�������ؼ�");
				continue;
			} else {
				System.out.println("���Ĺ�����" + salary + "��ֻ��ѡ����·�ؼ�");
				continue;
			}
		}

	}

}

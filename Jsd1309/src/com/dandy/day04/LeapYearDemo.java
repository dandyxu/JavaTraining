package com.dandy.day04;

import java.util.Scanner;

public class LeapYearDemo {

	/**
	 * �жϸ���������ǲ������꣡
	 * 1���ܱ�4���������Ҳ��ܱ�100��������ݣ������꣡
	 * 2���ܱ�400��������������꣡
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ����ݣ�");
		int year=sc.nextInt();
		if(year%4==0||year%400==0){
			 if(year%4==0&&year%100!=0){
				       System.out.println(year+"�ܱ�4�����Ҳ��ܱ�100�����������꣡");
			}else{
				       System.out.println(year+"�ܱ�4����Ҳ�ܱ�100�������������꣡");
			}
		}else{
			System.out.println(year+"�������꣡");
		}
	}
}
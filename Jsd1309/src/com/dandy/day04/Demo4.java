package com.dandy.day04;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
        int x=3,y=4;
        System.out.println(x>y?x:y);
        //int age=18;
        Scanner console=new Scanner(System.in);
        System.out.println("�������������䣺");
        int age=console.nextInt();                                   //��������һ����������ɨ��Ľ������ñ���
        System.out.println(age>=18?"���Խ���":"δ�����˽�ֹ����");
		int n=78;
		String s=(n>=90)?"a":((n<60)?"c":"b");
		System.out.println(s);
        
	}

}

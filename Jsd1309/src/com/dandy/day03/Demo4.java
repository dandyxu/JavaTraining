package com.dandy.day03;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("������һ������");
           int id=sc.nextInt();
           int gw=id%10;
           int sw=id/10%10;
           int bw=id/100%10;
           int qw=id/1000;
           System.out.println(id+"�ĸ�λ��Ϊ"+gw);                  //ƴ���ַ���
           System.out.println(id+"��ʮλ��Ϊ"+sw);
           System.out.println(id+"�İ�λ��Ϊ"+bw);
           System.out.println(id+"��ǧλ��Ϊ"+qw);

	}

}

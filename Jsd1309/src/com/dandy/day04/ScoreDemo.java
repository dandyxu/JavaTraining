package com.dandy.day04;

import java.util.Scanner;

public class ScoreDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("������һ��������");
			int score=sc.nextInt();
			if(score<0||score>100){
				System.out.println("�ף������ˡ���������ȷ�ķ�����");
				}else if(score==100){
					System.out.println("ѧ��");
					break;
				}else if(score>=90){
					System.out.println("���������������");
				}else if(score>=80){
					System.out.println("Сţ�����Ǻ�������");
				}else if(score>=70){
					System.out.println("һ�㣬�����ˣ�");
				}else if(score>60){
					System.out.println("����");
				}else if(score==60){
					System.out.println("��л��ʦ�������飡60�����꣡");
				}else{
					System.out.println("�ؼ�������ȥ�ɣ�");
				}
		}
		

	}

}

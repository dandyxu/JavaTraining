package com.dandy.day03;

import java.util.Scanner;

public class ScannerTime {
//�ù���Ϊ��һ��ʱ���ΪСʱ+����+��ĸ�ʽ���ڿ���̨����7199�룬��ӡ��1Сʱ59��59�����
	
	public static void main(String[] args) {
		Scanner time=new Scanner(System.in);
        System.out.print("������һ��ʱ�䣬��λΪ�룺");
        int i=time.nextInt();                         //�ܹ�ɨ������������Ǹ���
        int hour=i/3600;                              //�õ�Сʱ��
        int min=i/60%60;                              //�õ�������
        int sec=i%60;                                 //�õ�����
        System.out.println(i+"��="+hour+"Сʱ"+min+"��"+sec+"��");
        
	}
}

package com.day04;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {

	/**
	 * ������
	 * �������һ������n���ȴ��û�����²����ݣ�����û�����-1�������Ϸ
	 */
	public static void main(String[] args) {
         Random rd = new Random();
         Scanner sc = new Scanner(System.in);
         System.out.println("���������²�����֣�");
         int cmd = sc.nextInt();
         int num = rd.nextInt(10)+10;
         System.out.println(num);
         while(!"-1".equals(cmd)){
        	 if(num == cmd){
        		 System.out.println("��ϲ���������ˣ�");
        		 break;
        	 }else{
        		 System.out.println("������������Ҫ�²������:");
        		 break;
        	 }
         }//end while
         System.out.println("Game over!");
		
	}

}

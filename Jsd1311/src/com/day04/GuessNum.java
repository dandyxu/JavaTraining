package com.day04;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {

	/**
	 * 猜数字
	 * 随机生成一个数字n，等待用户输入猜测数据，如果用户输入-1则结束游戏
	 */
	public static void main(String[] args) {
         Random rd = new Random();
         Scanner sc = new Scanner(System.in);
         System.out.println("请输入您猜测的数字：");
         int cmd = sc.nextInt();
         int num = rd.nextInt(10)+10;
         System.out.println(num);
         while(!"-1".equals(cmd)){
        	 if(num == cmd){
        		 System.out.println("恭喜您，猜中了！");
        		 break;
        	 }else{
        		 System.out.println("请重新输入您要猜测的数字:");
        		 break;
        	 }
         }//end while
         System.out.println("Game over!");
		
	}

}

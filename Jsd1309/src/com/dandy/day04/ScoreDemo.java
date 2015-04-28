package com.dandy.day04;

import java.util.Scanner;

public class ScoreDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("请输入一个分数：");
			int score=sc.nextInt();
			if(score<0||score>100){
				System.out.println("亲，别闹了。请输入正确的分数：");
				}else if(score==100){
					System.out.println("学霸");
					break;
				}else if(score>=90){
					System.out.println("大神，请赐我力量！");
				}else if(score>=80){
					System.out.println("小牛，还是很厉害！");
				}else if(score>=70){
					System.out.println("一般，加油了！");
				}else if(score>60){
					System.out.println("及格");
				}else if(score==60){
					System.out.println("感谢老师手下留情！60分万岁！");
				}else{
					System.out.println("回家卖红薯去吧！");
				}
		}
		

	}

}

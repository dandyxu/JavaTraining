package com.dandy.day04;

import java.util.Scanner;

public class LeapYearDemo {

	/**
	 * 判断给定的年份是不是闰年！
	 * 1、能被4整除，并且不能被100整除的年份，是闰年！
	 * 2、能被400整除的年份是闰年！
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int year=sc.nextInt();
		if(year%4==0||year%400==0){
			 if(year%4==0&&year%100!=0){
				       System.out.println(year+"能被4整除且不能被100整除，是闰年！");
			}else{
				       System.out.println(year+"能被4整除也能被100整除，不是闰年！");
			}
		}else{
			System.out.println(year+"不是闰年！");
		}
	}
}
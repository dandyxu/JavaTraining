package com.dandy.day05;

//Struts2
/**
 * 
 * @author Dandy ˼���⣺ ��forѭ����1+2+3+4...+100
 */
public class ForDemo2 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		for (i = 1; i <= 100; i++) {
			sum += i; // sum=sum+i
		}
		System.out.println(sum);
	}
}
/*
 * ִ��˳����i=1,�ж�i<=100��Ϊtrue��ִ��sum=0+1,sum=1,ִ��i++,i=2
 * i=2,�ж�i<=100,Ϊtrue��ִ��sum=1+2,i++,i=3 i=3,�ж�i<=100,Ϊtrue, ִ��sum=1+2+3,i++,i=4
 * i=4,�ж�i<=100,Ϊtrue, ִ��sum=1+2+3+4,i++,i=5
 */

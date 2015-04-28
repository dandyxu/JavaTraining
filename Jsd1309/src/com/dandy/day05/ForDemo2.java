package com.dandy.day05;

//Struts2
/**
 * 
 * @author Dandy 思考题： 用for循环把1+2+3+4...+100
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
 * 执行顺序，先i=1,判断i<=100，为true，执行sum=0+1,sum=1,执行i++,i=2
 * i=2,判断i<=100,为true，执行sum=1+2,i++,i=3 i=3,判断i<=100,为true, 执行sum=1+2+3,i++,i=4
 * i=4,判断i<=100,为true, 执行sum=1+2+3+4,i++,i=5
 */

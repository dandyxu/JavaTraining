package com.dandy.day06;

public class Demo2 {

	/**
	 * String code="6932454173525"  求奇数位之和是多少
	 * '6'='0'+6=48+6
	 */
	public static void main(String[] args) {
            String code="6932454173525";
            int sum=0;
            for (int i = 0; i <= code.length(); i+=2) {
            	char c=code.charAt(i);                    //i为游标，code.charAt(i)取出char类型的数字，需要-'0'才能得到int型的数字
            	int n=c-'0';
            	sum+=n;
            }
            System.out.println("奇数位之和为："+sum);

	}

}

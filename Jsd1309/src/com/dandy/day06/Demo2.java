package com.dandy.day06;

public class Demo2 {

	/**
	 * String code="6932454173525"  ������λ֮���Ƕ���
	 * '6'='0'+6=48+6
	 */
	public static void main(String[] args) {
            String code="6932454173525";
            int sum=0;
            for (int i = 0; i <= code.length(); i+=2) {
            	char c=code.charAt(i);                    //iΪ�α꣬code.charAt(i)ȡ��char���͵����֣���Ҫ-'0'���ܵõ�int�͵�����
            	int n=c-'0';
            	sum+=n;
            }
            System.out.println("����λ֮��Ϊ��"+sum);

	}

}

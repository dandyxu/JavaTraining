package com.dandy.day04;

import java.util.Scanner;

public class ScannerFee {

	/**����̨����ԭ�ȵĹ���
	 * 8000   20%
	 *        30%    double
	 */
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
        System.out.println("���������Ĺ��ʣ�");
        double salary=console.nextDouble();
        System.out.println(salary>=8000?"�����¹�������Ϊ��"+salary*(1+0.2):"�����¹�������Ϊ��"+salary*(1+0.3));
	}
}



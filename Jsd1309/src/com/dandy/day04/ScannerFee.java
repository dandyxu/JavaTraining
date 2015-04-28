package com.dandy.day04;

import java.util.Scanner;

public class ScannerFee {

	/**控制台输入原先的工资
	 * 8000   20%
	 *        30%    double
	 */
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
        System.out.println("请输入您的工资：");
        double salary=console.nextDouble();
        System.out.println(salary>=8000?"您的新工资总数为："+salary*(1+0.2):"您的新工资总数为："+salary*(1+0.3));
	}
}



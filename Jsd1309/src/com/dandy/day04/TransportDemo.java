package com.dandy.day04;

import java.util.Scanner;

public class TransportDemo {

	/**
	 * 练习：控制台中输入工资，根据工资水平，选择回家交通工具 
	 * 8000以上（包括8000），选择飞机 
	 * 5000到7999,（包括5000），选择高铁
	 * 3000到4999（包括3000），选择普通火车 
	 * 1500到2999（包括2999），选择汽车 
	 * 其他的选择走路回家
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入自己的工资：");
			int salary = sc.nextInt();
			if (salary >= 8000) {
				System.out.println("您的工资是" + salary + "，可以选择飞机回家！");
				continue;
			} else if (salary >= 5000 && salary < 7999) {
				System.out.println("您的工资是" + salary + "，可以选择高铁回家");
				continue;
			} else if (salary >= 3000 && salary < 4999) {
				System.out.println("您的工资是" + salary + "，可以选择普通火车回家");
				continue;
			} else if (salary > 1500 && salary <= 2999) {
				System.out.println("您的工资是" + salary + "，可以选择汽车回家");
				continue;
			} else {
				System.out.println("您的工资是" + salary + "，只能选择走路回家");
				continue;
			}
		}

	}

}

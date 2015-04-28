package com.dandy.day10;

public class PersonDemo {

	/**
	 * 提供方法：结婚，参数是另一个人 定义合理的结婚规则 结婚结果，如果成功就合理，更新双方的属性
	 * 婚否和伴侣，返回true,代表结婚成功，结婚失败就返回false
	 */
	public static void main(String[] args) {
		Person p1 = new Person(1, "于果", '男', 28, false, "320112199201060015X",
				"大飞修理厂", "18762693048", "");
		Person p2 = new Person(2, "李三妹", '女', 27, false,
				"3201121992123123015X", "三胜旅行社", "1876261", "");

		System.out.println(p1.name + " 和 " + p2.name + "能否结婚:" + p1.Marry(p2));
		System.out.println(p1.isMarried + p1.name + "的伴侣是:" + p1.PName);
		System.out.println(p2.isMarried + p2.name + "的伴侣是:" + p2.PName);

	}

}

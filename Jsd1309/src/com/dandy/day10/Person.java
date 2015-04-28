package com.dandy.day10;

/**
 * 
 * 编号，名字，性别，年龄，婚否，身份证号，地址，伴侣
 * 
 */
public class Person {
	int id;
	String name;
	char gender;
	int age;
	boolean isMarried;
	String Cid;
	String address;
	String phone;
	String PName; // 伴侣名字

	public Person(int id, String name, char gender, int age, boolean isMarried,
			String cid, String address, String phone, String pName) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.isMarried = isMarried;
		Cid = cid;
		this.address = address;
		this.phone = phone;
		PName = pName;
	}

	public boolean Marry(Person p) {                                   //定义一个结婚方法，Person p参数为另一个人
		if (this.gender != p.gender) {                                 //this.gener里的this指的是本类Person
			if (this.isMarried == false && p.isMarried == false) {
				this.isMarried = true;
				p.isMarried = true;
				this.PName = p.name;
				p.PName = this.name;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}

package com.dandy.day10;

/**
 * 
 * ��ţ����֣��Ա����䣬������֤�ţ���ַ������
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
	String PName; // ��������

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

	public boolean Marry(Person p) {                                   //����һ����鷽����Person p����Ϊ��һ����
		if (this.gender != p.gender) {                                 //this.gener���thisָ���Ǳ���Person
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

package com.day03;

import java.util.Scanner;
import java.sql.*;

public class AddDBTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û���:");
		String name = sc.next();
		System.out.println("���������룺");
		String pwd = sc.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("�޷��ҵ�������");
		}
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/abcd", "root", "xuwenqian");
			Statement stat = con.createStatement();
			String sql = "insert into duser (dname,dpwd,ddata) values ('"
					+ name + "','" + pwd + "',now())";
			int i = stat.executeUpdate(sql);
			if (i == 1)
				System.out.println("����ɹ�");
			else
				System.out.println("����ʧ��");
			stat.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();// �����ջ��Ϣ
		}

	}

}

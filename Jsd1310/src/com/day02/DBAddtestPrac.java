package com.day02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAddtestPrac {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("�Ҳ���������");
		}

		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/abcd", "root", "xuwenqian");
			Statement stat = con.createStatement();
			int i = stat
					.executeUpdate("update duser set dname='��',dpwd='asdfg' where id=3");
			if (i == 1)
				System.out.println("�޸ĳɹ�");
			else
				System.out.println("�޸�ʧ��");

		} catch (SQLException e) {
			e.getStackTrace();
		}

	}
}

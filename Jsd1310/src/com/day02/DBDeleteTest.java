package com.day02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDeleteTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("û���ҵ�������");
		}

		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/abcd", "root", "xuwenqian");
			Statement stat = con.createStatement();
			int i = stat.executeUpdate("delete from duser where id=5");
			if (i == 1)
				System.out.println("ɾ���ɹ�");
			else
				System.out.println("ɾ��ʧ��");

		} catch (SQLException ex) {
			ex.getStackTrace();
		}

	}

}

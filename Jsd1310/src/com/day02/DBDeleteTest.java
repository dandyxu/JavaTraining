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
			System.out.println("没有找到驱动类");
		}

		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/abcd", "root", "xuwenqian");
			Statement stat = con.createStatement();
			int i = stat.executeUpdate("delete from duser where id=5");
			if (i == 1)
				System.out.println("删除成功");
			else
				System.out.println("删除失败");

		} catch (SQLException ex) {
			ex.getStackTrace();
		}

	}

}

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
			System.out.println("找不到驱动类");
		}

		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/abcd", "root", "xuwenqian");
			Statement stat = con.createStatement();
			int i = stat
					.executeUpdate("update duser set dname='吴',dpwd='asdfg' where id=3");
			if (i == 1)
				System.out.println("修改成功");
			else
				System.out.println("修改失败");

		} catch (SQLException e) {
			e.getStackTrace();
		}

	}
}

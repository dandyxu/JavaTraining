package com.day02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAddTest {
	public static void main(String[] args) {
		// 加载驱动类
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("无法找到驱动类");
		}
		// 数据库操作
		try {
			// 负责连接数据库
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/abcd", "root", "xuwenqian");
			// 由Connection产生用于执行SQL语句
			Statement stat = con.createStatement();
			int i = stat
					.executeUpdate("insert into duser (dname,dpwd) values ('徐','admin')");
			if (i == 1)
				System.out.println("添加成功");
			else
				System.out.println("添加失败");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

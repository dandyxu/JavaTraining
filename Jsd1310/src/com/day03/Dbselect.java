package com.day03;

import java.sql.*;

public class Dbselect {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("未找到驱动类");
		}
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/abcd", "root", "xuwenqian");
			Statement stat = con.createStatement();
			ResultSet res = stat.executeQuery("select * from duser");
			System.out.println("序号:\t用户名:\t密码:\t时间");
			while (res.next()) {
				System.out.print(res.getInt("id") + "\t");
				System.out.print(res.getString("dname") + "\t");
				System.out.print(res.getString("dpwd") + "\t");
				System.out.println(res.getDate("ddata"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}

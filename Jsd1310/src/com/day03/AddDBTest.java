package com.day03;

import java.util.Scanner;
import java.sql.*;

public class AddDBTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String name = sc.next();
		System.out.println("请输入密码：");
		String pwd = sc.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("无法找到驱动类");
		}
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/abcd", "root", "xuwenqian");
			Statement stat = con.createStatement();
			String sql = "insert into duser (dname,dpwd,ddata) values ('"
					+ name + "','" + pwd + "',now())";
			int i = stat.executeUpdate(sql);
			if (i == 1)
				System.out.println("插入成功");
			else
				System.out.println("插入失败");
			stat.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();// 输出堆栈信息
		}

	}

}

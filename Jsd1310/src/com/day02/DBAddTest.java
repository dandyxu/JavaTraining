package com.day02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAddTest {
	public static void main(String[] args) {
		// ����������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("�޷��ҵ�������");
		}
		// ���ݿ����
		try {
			// �����������ݿ�
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/abcd", "root", "xuwenqian");
			// ��Connection��������ִ��SQL���
			Statement stat = con.createStatement();
			int i = stat
					.executeUpdate("insert into duser (dname,dpwd) values ('��','admin')");
			if (i == 1)
				System.out.println("��ӳɹ�");
			else
				System.out.println("���ʧ��");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

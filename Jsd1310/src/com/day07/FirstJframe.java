package com.day07;

import javax.swing.JFrame;

public class FirstJframe extends JFrame {
	// ����һ���������ڳ�ʼ��
	public void showMe() {
		this.setTitle("���С��");
		this.setBounds(200, 100, 800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);

	}

	// ����һ��������������������
	public void addJpanel() {
		FirstJpanel fjp = new FirstJpanel();
		fjp.startBall();
		this.add(fjp);
	}

	public static void main(String[] args) {
		FirstJframe fjf = new FirstJframe();
		fjf.addJpanel();
		fjf.showMe();

	}

}

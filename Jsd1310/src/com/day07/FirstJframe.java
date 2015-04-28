package com.day07;

import javax.swing.JFrame;

public class FirstJframe extends JFrame {
	// 定义一个方法用于初始化
	public void showMe() {
		this.setTitle("多个小球");
		this.setBounds(200, 100, 800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);

	}

	// 定义一个方法用于完成面板的添加
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

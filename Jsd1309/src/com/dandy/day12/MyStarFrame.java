package com.dandy.day12;

import javax.swing.JFrame;

public class MyStarFrame extends JFrame {
	StarPanel panel;

	void addPanel() {
		panel = new StarPanel();
		this.add(panel);
	}

	void showMe() {
		this.setSize(780, 680);// px
		this.setTitle("��һ������");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ���Ѵ��ڹر�֮�󣬳���ֹͣ����
		this.setVisible(true);
	}

	public static void main(String[] args) {
		MyStarFrame frame = new MyStarFrame();
		frame.showMe();
		frame.addPanel();

	}

}

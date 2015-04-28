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
		this.setTitle("画一颗星星");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 当把窗口关闭之后，程序停止运行
		this.setVisible(true);
	}

	public static void main(String[] args) {
		MyStarFrame frame = new MyStarFrame();
		frame.showMe();
		frame.addPanel();

	}

}

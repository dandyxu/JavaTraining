package com.day01;

import javax.swing.JFrame;

public class PlaneJframe extends JFrame {
	// 定义一个方法用于初始化窗体
	public void showMe() {
		// 标题
		this.setTitle("打飞机");
		// 指定位置打开窗体
		this.setBounds(200, 100, 400, 600);
		// 关闭窗口时结束线程
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 不可调节窗体大小
		this.setResizable(false);
		// 显示
		this.setVisible(true);
	}

	// 定义一个方法用于加载面板
	private void addPanel() {
		PlaneJpanel pjp = new PlaneJpanel();
		pjp.startBkImg();
		this.add(pjp);
	}

	public static void main(String[] args) {
		PlaneJframe pjf = new PlaneJframe();
		pjf.addPanel();
		pjf.showMe();
	}
}

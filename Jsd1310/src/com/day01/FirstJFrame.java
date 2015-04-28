package com.day01;

import javax.swing.JFrame;

public class FirstJFrame extends JFrame {

	// 定义一个方法，用于完成窗体初始化
	public void showMe() {
		// 标题
		this.setTitle("鼠标事件");
		// 窗体大小
		// this.setSize(400,600);
		// 指定位置打开窗体
		this.setBounds(200, 100, 400, 600);
		// 关闭
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 显示
		this.setVisible(true);
	}

	// 定义一个方法用于加载面板
	private void addPanel() {
		FirstJPanel fjp = new FirstJPanel();
		fjp.startBall();
		this.add(fjp);

	}

	public static void main(String[] args) {
		FirstJFrame fjf = new FirstJFrame();
		fjf.addPanel();
		fjf.showMe();

	}

}

package com.dandy.day12;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class StarPanel extends JPanel {
	public void paint(Graphics g) { // 画笔
		super.paint(g);
		this.setBackground(Color.BLACK);
		Font f = new Font("宋体", Font.BOLD, 30);
		g.setFont(f);
		g.setColor(Color.WHITE);
		g.drawString("*", 600, 60);// x,y为左顶点坐标
		g.drawArc(400, 200, 50, 50, 0, 360);// 画一个圆
		g.fillArc(500, 100, 50, 50, 0, 360);// 画一个满圆
		

	}
}

package com.day01;

import javax.swing.JFrame;

public class PlaneJframe extends JFrame {
	// ����һ���������ڳ�ʼ������
	public void showMe() {
		// ����
		this.setTitle("��ɻ�");
		// ָ��λ�ô򿪴���
		this.setBounds(200, 100, 400, 600);
		// �رմ���ʱ�����߳�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ɵ��ڴ����С
		this.setResizable(false);
		// ��ʾ
		this.setVisible(true);
	}

	// ����һ���������ڼ������
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

package com.day01;

import javax.swing.JFrame;

public class FirstJFrame extends JFrame {

	// ����һ��������������ɴ����ʼ��
	public void showMe() {
		// ����
		this.setTitle("����¼�");
		// �����С
		// this.setSize(400,600);
		// ָ��λ�ô򿪴���
		this.setBounds(200, 100, 400, 600);
		// �ر�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ��ʾ
		this.setVisible(true);
	}

	// ����һ���������ڼ������
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

package com.dandy.day02;

import java.awt.Color;

import javax.swing.JFrame;                          //������е�JFrame����
import javax.swing.JLabel;
import javax.swing.JPanel;
/*������ΪJframeDemo����Ҫ������frame,panel,label,ͬʱ�䱳����ɫΪblue����Ҫ��panelǶ����frame�У�label�����panel�У�
 ���ô��ڱ���Ϊ��������ʾ�����ߴ��С���ɼ���                                  Founded by Dandy in 10th.Sept                               
 */
public class JframeDemo {

	public static void main(String[] args) {
         JFrame frame=new JFrame();                 //����һ��Jframe����
         JPanel panel=new JPanel();                 //����һ��panel����
         JLabel label=new JLabel("Java");           //����һ����ǩ����
         panel.setBackground(Color.blue);           //����������һ��������ɫ
         frame.add(panel);                          //��panelǶ����frame��
         panel.add(label);                          //��label�����panel��
         
         frame.setTitle("������ʾ");                 //����������һ������
         frame.setSize(500,400);                    //���ô��ڳߴ�
         frame.setVisible(true);                    //���ô��ڿɼ�
	}

}

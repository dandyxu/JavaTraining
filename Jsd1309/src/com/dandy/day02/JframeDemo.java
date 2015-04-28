package com.dandy.day02;

import java.awt.Color;

import javax.swing.JFrame;                          //将类库中的JFrame导入
import javax.swing.JLabel;
import javax.swing.JPanel;
/*该类名为JframeDemo，主要对象有frame,panel,label,同时其背景颜色为blue，需要将panel嵌套入frame中，label添加至panel中，
 设置窗口标题为“窗口演示”，尺寸大小及可见。                                  Founded by Dandy in 10th.Sept                               
 */
public class JframeDemo {

	public static void main(String[] args) {
         JFrame frame=new JFrame();                 //创建一个Jframe对象
         JPanel panel=new JPanel();                 //创建一个panel对象
         JLabel label=new JLabel("Java");           //创建一个标签对象
         panel.setBackground(Color.blue);           //给画板设置一个背景颜色
         frame.add(panel);                          //将panel嵌套入frame中
         panel.add(label);                          //将label添加至panel中
         
         frame.setTitle("窗口演示");                 //给窗口设置一个标题
         frame.setSize(500,400);                    //设置窗口尺寸
         frame.setVisible(true);                    //设置窗口可见
	}

}

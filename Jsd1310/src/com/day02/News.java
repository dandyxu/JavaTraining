package com.day02;

public class News {
	private String title;
	private String createN;

	// ����һ�����췽��������ɳ�ʼ��
	public News(String title, String createN) {
		this.title = title;
		this.createN = createN;
	}

	// ����һ���������������Ϣ
	public void getMess() {
		System.out.println("����:" + title + "\t" + "��������:" + createN);
	}

	public String getTitle() {
		return title;
	}

	public String getCreateN() {
		return createN;
	}
	
	
}

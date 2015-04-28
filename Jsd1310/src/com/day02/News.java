package com.day02;

public class News {
	private String title;
	private String createN;

	// 定义一个构造方法用于完成初始化
	public News(String title, String createN) {
		this.title = title;
		this.createN = createN;
	}

	// 定义一个方法用于输出信息
	public void getMess() {
		System.out.println("标题:" + title + "\t" + "发布人是:" + createN);
	}

	public String getTitle() {
		return title;
	}

	public String getCreateN() {
		return createN;
	}
	
	
}

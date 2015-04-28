package com.oop.day05;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 使用Java API倒计时类实现倒计时功能
 */

public class CountDown extends TimerTask {

	public void run() {
		for (int i = 10; i >= 0; i--) {
            System.out.println(i);
		}
		//System.out.println("MyTask...");
	}

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new CountDown(), 2000, 2000);
		// timer.cancel();
	}
}

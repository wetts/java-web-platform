package com.wetts._api.thread.base.runnable;

public class StartDemo {

	public static void main(String[] args) {
		new Thread(new MyThread()).start();
		new Thread(new MyThread()).start();
		System.out.println("-----------------------------------------------");
	}
}

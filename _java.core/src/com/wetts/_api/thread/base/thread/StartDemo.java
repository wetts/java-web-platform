package com.wetts._api.thread.base.thread;

public class StartDemo {

	public static void main(String[] args) {
		new MyThread().start();
		new MyThread().start();
		new Thread(new MyThread()).start();
		System.out.println("-------------------------------------------------");
	}
}

package com.wetts._api.thread.safe.lock.sync.waitNotify.demo;

public class WaitThread extends Thread {

	private String[] flag = null;

	public WaitThread(String name, String[] flag) {
		super(name);
		this.flag = flag;
	}

	public void run() {
		synchronized (flag) {
			while (!flag[0].equals("false")) {
				System.out.println(getName() + " begin waiting!");
				long waitTime = System.currentTimeMillis();
				try {
					flag.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				waitTime = System.currentTimeMillis() - waitTime;
				System.out.println("wait time :" + waitTime);
			}
			System.out.println(getName() + " end waiting!");
		}
	}
}

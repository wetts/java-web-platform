package com.wetts._api.thread.safe.lock.sync.waitNotify.demo;

public class NotifyThread extends Thread {

	private String[] flag = null;

	public NotifyThread(String name, String[] flag) {
		super(name);
		this.flag = flag;
	}

	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (flag) {
			flag[0] = "false";
			flag.notifyAll();
		}
	}

}

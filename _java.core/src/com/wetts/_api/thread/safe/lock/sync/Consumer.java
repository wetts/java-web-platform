package com.wetts._api.thread.safe.lock.sync;

public class Consumer implements Runnable {

	@Override
	public synchronized void run() {
		int count = 10;
		while (count > 0) {
			synchronized (Client.obj) {
				System.out.print("B");
				count--;
				Client.obj.notify(); // 主动释放对象锁
				try {
					Client.obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

}

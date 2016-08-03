package com.wetts._api.thread.safe.lock.lock;

import java.util.concurrent.locks.Lock;

public class Producer implements Runnable {

	private Lock lock;

	public Producer(Lock lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		int count = 10;
		while (count > 0) {
			try {
				lock.lock();
				count--;
				System.out.print("A");
			} finally {
				lock.unlock();
				try {
					Thread.sleep(90L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

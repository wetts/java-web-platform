package com.wetts._api.thread.safe.lock.sync;

public class Produce implements Runnable {

	@Override
	public void run() {
		int count = 10;
		while (count > 0) {
			synchronized (Client.obj) {
				// System.out.print("count = " + count);
				System.out.print("A");
				count--;
				Client.obj.notify();
				try {
					Client.obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}

	}

}

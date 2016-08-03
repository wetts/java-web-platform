package com.wetts._api.thread.safe.lock.sync.waitNotify.demo;

import java.util.concurrent.TimeUnit;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		String flag[] = { "true" };
		System.out.println("Main Thread Run!");
		NotifyThread notifyThread = new NotifyThread("notify01", flag);
		WaitThread waitThread01 = new WaitThread("waiter01", flag);
		WaitThread waitThread02 = new WaitThread("waiter02", flag);
		WaitThread waitThread03 = new WaitThread("waiter03", flag);
		waitThread01.start();
		waitThread02.start();
		waitThread03.start();
		TimeUnit.SECONDS.sleep(5);
		notifyThread.start();
	}
}

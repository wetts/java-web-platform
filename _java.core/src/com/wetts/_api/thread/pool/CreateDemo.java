package com.wetts._api.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CreateDemo {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(5);
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		Thread t4 = new Thread(runnable);
		Thread t5 = new Thread(runnable);
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
		pool.shutdown();
	}
}

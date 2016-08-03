package com.wetts._api.thread.safe.lock.lock.condition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		// 容器已满 綁定product線程
		Condition full = lock.newCondition();
		// 容器为空 綁定consumer線程
		Condition empty = lock.newCondition();

		List<Object> list = new ArrayList<Object>(12);
		Product product = new Product(list, 10, lock, full, empty);
		Consumer consumer = new Consumer(list, 0, lock, full, empty);

		Thread t1 = new Thread(product);
		Thread t2 = new Thread(consumer);

		t1.start();
		t2.start();
	}
}

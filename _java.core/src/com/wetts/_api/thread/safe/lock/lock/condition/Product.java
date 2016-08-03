package com.wetts._api.thread.safe.lock.lock.condition;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Product implements Runnable {

	private List<Object> list;
	private int maxCount;
	private Lock lock = null;
	// 容器已满  綁定product線程
	private Condition full = null;
	// 容器为空  綁定consumer線程
	private Condition empty = null;

	public Product(List<Object> list, int maxCount, Lock lock, Condition full, Condition empty) {
		super();
		this.list = list;
		this.maxCount = maxCount;
		this.lock = lock;
		this.full = full;
		this.empty = empty;
	}

	@Override
	public void run() {
		while (true) {
			if (lock.tryLock()) {
				try {
					if (getSize() >= maxCount) {
						System.out.println("容器已滿，product線程加入池中...");
						full.await();
					}
					System.out.println("開始生產....");
					list.add(new Object());
					// 喚醒消費者線程
					empty.signal();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			} else {
				System.out.println("未获取生产资格...");
			}
		}
	}

	public int getSize() {
		return list.size();
	}
}

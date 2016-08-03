package com.wetts._api.thread.safe.lock.lock.condition;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable {
	
	private List<Object> list;
	private int minCount;
	private Lock lock = null;
	// 容器已满 綁定product線程
	private Condition full = null;
	// 容器为空 綁定consumer線程
	private Condition empty = null;

	public Consumer(List<Object> list, int minCount, Lock lock, Condition full, Condition empty) {
		super();
		this.list = list;
		this.minCount = minCount;
		this.lock = lock;
		this.full = full;
		this.empty = empty;
	}

	@Override
	public void run() {
		while (true) {
			if (lock.tryLock()) {
				try {
					if (getSize() <= minCount) {
						System.out.println("容器已空，consumer線程加入池中...");
						empty.await();
					}
					System.out.println("開始消費....");
					list.remove(0);
					// 喚醒生產者線程
					full.signal();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			} else {
				System.out.println("未获取消费资格...");
			}
		}
	}

	public int getSize() {
		return list.size();
	}
}

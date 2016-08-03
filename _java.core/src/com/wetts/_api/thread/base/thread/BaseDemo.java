package com.wetts._api.thread.base.thread;

public class BaseDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new MyThread();
		// 设置线程名称
		thread.setName("hehe");
		// 获取线程名称
		System.out.println(thread.getName());
		// 设置守护线程
		// 只有当线程处于非活动状态时，才能设置
		thread.setDaemon(true);
		// 测试线程是否已经中断
		System.out.println("isInterrupted: " + thread.isInterrupted());
		// 测试线程是否处于活动状态
		System.out.println("isAlive: " + thread.isAlive());
		// 设置线程优先级
		thread.setPriority(4);
		// 启动线程
		thread.start();
		// 返回线程状态
		System.out.println("state: " + thread.getState());
		// 暂停当前正在执行的线程对象，并执行其他线程
		Thread.yield();
		// 中断线程
		thread.interrupt();
	}
}

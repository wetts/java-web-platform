package com.wetts._api.thread.base.thread;

/**
 * join用于两个线程协同工作
 * 
 * @author wetts
 * @since 1.0, 2014/08/01
 */
public class JoinDemo {

	// 表示图片是否下载完毕
	public static boolean isFinish = false;

	public static void main(String[] args) {
		final Thread download = new Thread() {
			@Override
			public void run() {
				System.out.println("down:开始下载图片");
				for (int i = 0; i < 100; i++) {
					System.out.println("down:已下载" + i + "%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					isFinish = true;
				}
				System.out.println("down:图片下载完毕");
			}
		};
		Thread show = new Thread() {
			@Override
			public void run() {
				System.out.println("show:开始显示图片");
				try {
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (!isFinish) {
					throw new RuntimeException("show:图片没有下载");
				}
				System.out.println("show:正常显示图片");
			}
		};
		download.start();
		show.start();
	}
}

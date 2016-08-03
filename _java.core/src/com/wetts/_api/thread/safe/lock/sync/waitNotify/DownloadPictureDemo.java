package com.wetts._api.thread.safe.lock.sync.waitNotify;

/**
 * wait notify 注意，这两个方法不是线程中定义的。 这两个方法是再Object上定义的 所以，线程可以再任意对象上等待。
 * join只能再线程上等待。
 * 
 * @author wetts
 * @since 1.0, 2014/08/04
 */
public class DownloadPictureDemo {

	// 表示图片是否下载完毕
	public static boolean isFinish = false;

	public static void main(String[] args) {
		final Object o = new Object();
		Thread download = new Thread() {
			public void run() {
				System.out.println("down：开始下载图片");
				for (int i = 1; i <= 100; i++) {
					System.out.println("down：已下载：" + i + "%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("down：图片下载完毕");
				isFinish = true;
				synchronized (o) {
					o.notify();
				}
				System.out.println("down：开始下载Flash");
				for (int i = 1; i <= 100; i++) {
					System.out.println("down：已下载：" + i + "%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("down：flash下载完毕");
			}
		};

		Thread showImg = new Thread() {
			public void run() {
				synchronized (o) {
					try {
						o.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("show：开始显示图片");
				if (!isFinish) {
					throw new RuntimeException("图片没有下载完毕");
				}
				System.out.println("show：开始图片完成");
			}
		};
		download.start();
		showImg.start();
	}
}

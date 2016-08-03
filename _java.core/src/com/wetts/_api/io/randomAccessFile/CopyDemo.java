package com.wetts._api.io.randomAccessFile;

import java.io.RandomAccessFile;

/**
 * 复制案例 加快读写效率的方式是减少读写次数
 * 
 * @author wetts
 * @since 1.0, 2014/07/29
 */
public class CopyDemo {

	public static void main(String[] args) throws Exception {
		RandomAccessFile src = new RandomAccessFile("", "r");
		RandomAccessFile des = new RandomAccessFile("", "rw");
		byte[] buf = new byte[10240];
		int len = -1;
		while ((len = src.read(buf)) != -1) {
			des.write(buf, 0, len);
		}
		des.close();
		src.close();
		System.out.println("完毕");
	}
}

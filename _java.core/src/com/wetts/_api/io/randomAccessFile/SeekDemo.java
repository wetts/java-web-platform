package com.wetts._api.io.randomAccessFile;

import java.io.RandomAccessFile;

/**
 * RandomAccessFile总是在当前指针位置进行读写操作的
 * 
 * @author wetts
 * @since 1.0, 2014/07/29
 */
public class SeekDemo {

	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("22.txt", "rw");
		System.out.println("指针位置：" + raf.getFilePointer());
		raf.write(1);
		System.out.println("指针位置：" + raf.getFilePointer());
		raf.writeInt(5);
		System.out.println("指针位置：" + raf.getFilePointer());
		raf.writeDouble(1.0);

		// 将指针移动到文件的开始位置
		raf.seek(0);
		// 读取顺序要与写入顺序一致
		int b = raf.read();
		System.out.println(b);
		int i = raf.readInt();
		System.out.println(i);

		raf.close();
	}
}

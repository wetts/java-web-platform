package com.wetts._api.io.randomAccessFile;

import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 通过控制台输入内容，将内容写入文件
 * 若控制台输入的内容是exit，则程序退出。
 * 
 * @author wetts
 * @since 1.0, 2014/07/30
 */
public class InputFileDemo {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		RandomAccessFile raf = new RandomAccessFile("333.txt", "rw");
		String str = "";
		do {
			byte[] b = str.getBytes();
			raf.write(b);
			str = s.next();
		} while (!str.equals("exit"));
		raf.close();
		s.close();
	}
}

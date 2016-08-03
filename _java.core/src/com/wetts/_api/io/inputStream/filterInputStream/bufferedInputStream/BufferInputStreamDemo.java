package com.wetts._api.io.inputStream.filterInputStream.bufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * 缓冲字节输入流
 * 
 * @author wetts
 * @since 1.0, 2014/07/30
 */
public class BufferInputStreamDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("bos.dat");
		BufferedInputStream bis = new BufferedInputStream(fis);
		byte[] dat = new byte[100];
		int len = bis.read(dat);
		System.out.println(new String(dat, 0, len, "UTF-8"));
		fis.close();
	}
}

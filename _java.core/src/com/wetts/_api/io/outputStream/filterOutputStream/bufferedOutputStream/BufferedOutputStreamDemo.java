package com.wetts._api.io.outputStream.filterOutputStream.bufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * 缓冲字节输出流
 * 
 * @author wetts
 * @since 1.0, 2014/07/30
 */
public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("bos.dat");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "你是我的小呀小苹果";
		byte[] data = str.getBytes("UTF-8");
		bos.write(data);
		bos.flush();
		bos.close();
	}
}

package com.wetts._api.io.inputStream.fileInputStream;

import java.io.FileInputStream;

/**
 * 文件输入流
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class FileInputStreamDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("fos.dat");
		byte[] buf = new byte[100];
		int len = fis.read(buf);
		System.out.println("实际读取的字节数" + len);
		String str = new String(buf, 0, len, "utf-8");
		System.out.println(str);
		fis.close();
	}
}

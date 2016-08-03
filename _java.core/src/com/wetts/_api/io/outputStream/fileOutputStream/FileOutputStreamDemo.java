package com.wetts._api.io.outputStream.fileOutputStream;

import java.io.FileOutputStream;

/**
 * 文件输出流
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class FileOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("fos.dat", true);
		byte[] data = "天安门上太阳升".getBytes("utf-8");
		fos.write(data);
		fos.close();
	}
}

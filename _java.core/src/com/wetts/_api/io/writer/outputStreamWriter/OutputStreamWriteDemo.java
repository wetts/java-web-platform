package com.wetts._api.io.writer.outputStreamWriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * 字符输出流 以字符为单位写出数据
 * 
 * @author wetts
 * @since 1.0, 2014/07/30
 */
public class OutputStreamWriteDemo {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("ose.txt", true);
		/*
		 * 创建按照系统默认字符集写出字符的字符输出流
		 */
		OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
		osw.write("你是我的小呀小苹果");
		osw.close();
	}
}

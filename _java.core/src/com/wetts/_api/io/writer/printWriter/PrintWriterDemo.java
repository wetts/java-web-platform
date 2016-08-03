package com.wetts._api.io.writer.printWriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * PrintWriter 带有自动行刷新的缓冲字符输出流
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class PrintWriterDemo {

	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter(
				new OutputStreamWriter(
						new FileOutputStream("pw.txt"), "UTF-8"));
		pw.println("大家好！");
		pw.println("呵呵");
		pw.close();
	}
}

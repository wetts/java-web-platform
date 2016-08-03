package com.wetts._api.io.reader.inputStreamReaderDemo;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * InputStreamReader 字符输入流 按照指定字符集读取字符
 * 
 * @author wetts
 * @since 1.0, 2014/07/30
 */
public class InputStreamReaderDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("ose.txt");
		InputStreamReader isr = new InputStreamReader(fis, "GBK");
		int c = -1;
		while ((c = isr.read()) != -1) {
			System.out.print((char) c);
		}
		fis.close();
	}
}

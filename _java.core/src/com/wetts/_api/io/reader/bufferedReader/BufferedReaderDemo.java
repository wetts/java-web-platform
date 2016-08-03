package com.wetts._api.io.reader.bufferedReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 缓冲字符输入流
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream("note.txt"), "UTF-8"));
		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
	}
}

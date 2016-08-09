package com.wetts._util.transferfile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.Socket;


public class Client {

	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost", 11010);
			BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream("demo.txt"));
			int len = -1;
			while ((len = bis.read()) != -1) {
				bos.write(len);
			}
			bos.close();
			bis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

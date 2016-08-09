package com.wetts._util.transferfile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(11010);
			Socket socket = server.accept();
			System.out.println("连接成功");
			BufferedInputStream bis = new BufferedInputStream(
					socket.getInputStream());
			BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream("demoTmp.txt"));
			int len = -1;
			while ((len = bis.read()) != -1) {
				bos.write(len);
			}
			bis.close();
			bos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

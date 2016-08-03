package com.wetts._api.net.tcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 
 * @author wetts
 * @created 2015/06/06
 *
 */
public class Client {
	Socket socket;
	PrintWriter out;

	public Client() {
		try {
			socket = new Socket("127.0.0.1", 10000);
			out = new PrintWriter(socket.getOutputStream(), true);
			out.println("hello, server!");
			out.flush();
			out.println("bye");
			out.flush();
			out.close();
			socket.close();
		} catch (IOException e) {
		}
	}

	public static void main(String[] args) {
		new Client();
	}
}

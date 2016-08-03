package com.wetts._api.net.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author wetts
 * @created 2015/06/06
 *
 */
public class Server {
	private ServerSocket ss;
	private Socket socket;
	private BufferedReader in;

	public Server() {
		try {
			ss = new ServerSocket(10000);
			socket = ss.accept();
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = "";
			while (!"bye".equals(line = in.readLine())) {
				System.out.println("you input is :" + line);
			}
		} catch (IOException e) {
			
		} finally {
			try {
				in.close();
				socket.close();
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Server();
	}
}

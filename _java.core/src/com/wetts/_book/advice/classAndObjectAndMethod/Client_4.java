package com.wetts._book.advice.classAndObjectAndMethod;

/**
 * 构造函数尽量简化
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_4 {

	public static void main(String[] args) {
		new SimpleServer(1000);
	}
}

abstract class Server {
	
	public final static int DEFAULT_PORT = 40000;
	
	public Server() {
		int port = getPort();
		System.out.println("port is: " + port);
	}
	
	protected abstract int getPort();
}

class SimpleServer extends Server {

	private int port = 100;
	
	public SimpleServer(int port) {
		this.port = port;
	}
	
	@Override
	protected int getPort() {
		return Math.random() > 0.5 ? port : DEFAULT_PORT;
	}
	
}

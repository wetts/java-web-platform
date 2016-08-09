package com.wetts._util.chatroom.launch;


import com.wetts._util.chatroom.server.ChatServer;

/**
 * 启动服务器
 *
 * @author wetts
 * @since 1.0, 2014/08/10
 */
public class ServerLaunch {

	public static void main(String[] args) {
		new ChatServer().action();
	}
}

package com.wetts._api._socket.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 基于UDP传输协议的客户端
 * 
 * @author wetts
 * @since 1.0, 2014/08/05
 */
public class Client {

	public void start() {
		try {
			// 1 创建DatagramSocket
			DatagramSocket socket = new DatagramSocket();
			// 2 创建数据包
			String str = "你好！服务端！";
			// 将要发送的数据转换为字节数组
			byte[] buf = str.getBytes();
			// 确认目的地的地址
			InetAddress addr = InetAddress.getByName("localhost");
			// 打包
			DatagramPacket packet = new DatagramPacket(buf, buf.length, addr, 8088);
			// 3 发送
			socket.send(packet);

			byte[] recvBuf = new byte[100];
			DatagramPacket recvPacket = new DatagramPacket(recvBuf, recvBuf.length);
			socket.receive(recvPacket);
			System.out.println("服务端说：" + new String(recvPacket.getData(), 0, recvPacket.getLength()));

			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
}

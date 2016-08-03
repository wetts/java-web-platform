package com.wetts._api.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP服务端 对于UDP而言，其实没有所谓的绝对的服务端 接受方即服务端
 * 
 * @author wetts
 * @since 1.0, 2014/08/05
 */
public class Server {

	public void start() {
		try {
			// 1 打开端口，用于监听来自该端口的信息
			// 注意，UDP的端口和TCP的端口范围都是再0-65535之间，但是互相不冲突
			DatagramSocket socket = new DatagramSocket(8088);
			// 2 创建接收包，用于获取发送过来的数据
			byte[] recvBuf = new byte[100];
			// 该包允许接受100字节信息
			DatagramPacket recvpacket = new DatagramPacket(recvBuf, recvBuf.length);
			// 3 监听8088端口，等待消息
			socket.receive(recvpacket);
			// 4 将接收到的字节转换为字符串
			/*
			 * recvpacket.getData()方法获取的字节数组实际上就是上面我们创建该包时的数组recvBuf
			 */
			String str = new String(recvpacket.getData(), 0, recvpacket.getLength());
			System.out.println("客户端说：" + str);

			/*
			 * 给客户端发送一条信息
			 */
			String info = "你好，我是服务端！";
			byte[] buf = info.getBytes();
			// 确认地址
			/*
			 * 通过之前接受的数据包，获取发消息的客户端的地址和端口
			 */
			InetAddress addr = recvpacket.getAddress();
			int port = recvpacket.getPort();
			DatagramPacket packet = new DatagramPacket(buf, buf.length, addr, port);
			socket.send(packet);

			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
}

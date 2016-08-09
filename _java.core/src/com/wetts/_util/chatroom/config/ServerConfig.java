package com.wetts._util.chatroom.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 服务器配置数据
 *
 * @author wetts
 * @since 1.0, 2014/08/10
 */
public class ServerConfig {

    /**
     * 服务器地址
     */
    public static final String SERVER_ADDRESS;
    /**
     * 服务器端口
     */
    public static final int SERVER_PORT;
    /**
     * 线程池大小
     */
    public static final int THREADPOOL_SIZE;

    static {
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("server.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("server配置文件找不到");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SERVER_ADDRESS = p.getProperty("server_address");
        SERVER_PORT = Integer.parseInt(p.getProperty("server_port"));
        THREADPOOL_SIZE = Integer.parseInt(p.getProperty("threadPool_Size"));
    }

    /**
     * 测试config加载
     *
     * @param args
     */
//	public static void main(String[] args) {
//		System.out.println(SERVER_ADDRESS);
//		System.out.println(SERVER_PORT);
//		System.out.println(THREADPOOL_SIZE);
//	}
}

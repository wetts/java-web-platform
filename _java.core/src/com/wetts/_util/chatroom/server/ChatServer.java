package com.wetts._util.chatroom.server;


import com.wetts._util.chatroom.config.ServerConfig;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Chat的服务端
 *
 * @author wetts
 * @since 1.0, 2014/08/10
 */
public class ChatServer {

    // 服务器套接字
    private ServerSocket server;
    // client线程池
    private ExecutorService threadPool;
    /**
     * 服务器端口
     */
    private static final int SERVER_PORT = ServerConfig.SERVER_PORT;
    /**
     * 线程池大小
     */
    private static final int THREADPOOL_SIZE = ServerConfig.THREADPOOL_SIZE;

    public ChatServer() {
        try {
            server = new ServerSocket(SERVER_PORT);
        } catch (BindException e) {
            System.out.println("端口使用中....");
            System.out.println("请关掉相关程序并重新运行服务器！");
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        threadPool = Executors.newFixedThreadPool(THREADPOOL_SIZE);
    }

    /**
     * 服务端启动方法
     */
    public void action() {
        while (true) {
            try {
                Socket client = server.accept();
                threadPool.execute(new ClientProc(client));
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
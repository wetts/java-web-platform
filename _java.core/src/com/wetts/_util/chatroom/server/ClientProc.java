package com.wetts._util.chatroom.server;

import java.net.Socket;

/**
 * client线程
 * 用于接收client发送来的信息，并且转播
 *
 * @author wetts
 * @since 1.0, 2014/08/11
 */
public class ClientProc implements Runnable {

    private Socket socket;

    public ClientProc(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        // TODO Auto-generated method stub

    }
}

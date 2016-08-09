package com.wetts._util.chatroom.util;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.List;

/**
 * 发送消息的方法
 *
 * @author wetts
 * @since 1.0, 2014/08/11
 */
public class SentMessage {

    /**
     * 发送消息给所有用户
     *
     * @param sockets
     * @param str
     */
    public static void sentMessageToAll(List<Socket> sockets, String str) {
        for (Socket socket : sockets) {
            sentMesaageToOne(socket, str);
        }
    }

    /**
     * 发送消息给一个人
     *
     * @param socket 接收消息客户端的套接字
     * @param str    发送的消息
     */
    public static void sentMesaageToOne(Socket socket, String str) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(
                    new OutputStreamWriter(
                            socket.getOutputStream(), "UTF-8"));
            pw.println(str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}

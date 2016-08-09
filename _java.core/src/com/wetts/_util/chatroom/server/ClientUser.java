package com.wetts._util.chatroom.server;

import com.wetts._util.chatroom.config.SysConfig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

/**
 * 用来储存连接客户端的信息的
 *
 * @author wetts
 * @since 1.0, 2014/08/11
 */
public class ClientUser {

    // 用户姓名
    private String name;
    // 用户性别
    private int gender;
    // 用户套接字
    private Socket socket;
    // 字符输入流
    private BufferedReader br;
    // 字符输出流
    private PrintWriter pw;

    public ClientUser(String name, int gender, Socket socket) {
        this.name = name;
        this.gender = gender;
        this.socket = socket;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream(), SysConfig.CODING));
            pw = new PrintWriter(
                    new OutputStreamWriter(
                            socket.getOutputStream(), SysConfig.CODING));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public Socket getSocket() {
        return socket;
    }

    public BufferedReader getBr() {
        return br;
    }

    public PrintWriter getPw() {
        return pw;
    }
}
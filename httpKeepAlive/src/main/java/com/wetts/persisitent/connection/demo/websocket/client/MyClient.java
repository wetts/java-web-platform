package com.wetts.persisitent.connection.demo.websocket.client;

import javax.websocket.*;
import java.io.IOException;

/**
 * Created by linger on 2016/7/21.
 */
@ClientEndpoint
public class MyClient {
    @OnOpen
    public void onOpen(Session session) {
        System.out.println("Connected to endpoint:"+ session.getBasicRemote());
        try {
            session.getBasicRemote().sendText("Hello");
        } catch (IOException ex) {
        }
    }

    @OnMessage
    public void onMessage(String message) {
        System.out.println(message);
    }

    @OnError
    public void onError(Throwable t) {
        t.printStackTrace();
    }
}

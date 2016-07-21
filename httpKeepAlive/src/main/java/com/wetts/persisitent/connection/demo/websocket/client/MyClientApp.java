package com.wetts.persisitent.connection.demo.websocket.client;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

/**
 * Created by linger on 2016/7/21.
 */
public class MyClientApp {

    public Session session;

    protected void start()
    {

        WebSocketContainer container = ContainerProvider.getWebSocketContainer();

        String uri ="ws://127.0.0.1:10888/websocket.ws/110/12345";
        System.out.println("Connecting to"+ uri);
        try {
            session = container.connectToServer(MyClient.class, URI.create(uri));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DeploymentException e) {
            e.printStackTrace();
        }

    }
    public static void main(String args[]){
        MyClientApp client = new MyClientApp();
        client.start();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input ="";
        try {
            do{
                input = br.readLine();
                if(!input.equals("exit"))
                    client.session.getBasicRemote().sendText(input);

            }while(!input.equals("exit"));

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

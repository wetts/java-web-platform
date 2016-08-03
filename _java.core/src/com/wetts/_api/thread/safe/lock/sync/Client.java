package com.wetts._api.thread.safe.lock.sync;

public class Client {

	public static final Object obj = new Object();
    
    public static void main(String[] args) {
           new Thread( new Produce()).start();
           new Thread( new Consumer()).start();
          
    }
}

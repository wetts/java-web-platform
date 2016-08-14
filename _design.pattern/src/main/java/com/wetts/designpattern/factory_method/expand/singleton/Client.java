package com.wetts.designpattern.factory_method.expand.singleton;

public class Client {

	public static void main(String[] args) {
		SingletonFactory.getSingleton().doSomething();
	}
}

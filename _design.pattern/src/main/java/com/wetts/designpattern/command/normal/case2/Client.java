package com.wetts.designpattern.command.normal.case2;

public class Client {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		Command command = new ConcreteCommand1();
		invoker.setCommand(command);
		invoker.action();
	}

}

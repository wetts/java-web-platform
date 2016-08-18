package com.wetts.designpattern.command.example;

public class Client {

	public static void main(String[] args) {
		Invoke momo = new Invoke();
		Command command = new AddRequirementCommand();
		momo.setCommand(command);
		momo.action();
	}
}

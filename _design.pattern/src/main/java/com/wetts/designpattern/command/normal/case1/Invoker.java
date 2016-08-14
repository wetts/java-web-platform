package com.wetts.designpattern.command.normal.case1;

public class Invoker {

	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void action() {
		this.command.execute();
	}
}

package com.wetts.designpattern.command.normal.case1;

public class ConcreteCommand1 extends Command {

	private Receiver receiver;
	
	public ConcreteCommand1(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		this.receiver.doSomething();
	}

}

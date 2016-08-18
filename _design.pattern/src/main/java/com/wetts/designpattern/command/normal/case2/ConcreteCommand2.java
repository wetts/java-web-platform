package com.wetts.designpattern.command.normal.case2;

public class ConcreteCommand2 extends Command {

	public ConcreteCommand2() {
		super(new ConcreteReceiver2());
	}
	
	public ConcreteCommand2(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		super.receiver.doSomething();
	}

}

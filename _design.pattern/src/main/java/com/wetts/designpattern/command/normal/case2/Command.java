package com.wetts.designpattern.command.normal.case2;

public abstract class Command {

	protected final Receiver receiver;
	
	public Command(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public abstract void execute();
}

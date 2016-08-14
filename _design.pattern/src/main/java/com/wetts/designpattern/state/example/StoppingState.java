package com.wetts.designpattern.state.example;

public class StoppingState extends LiftState {

	@Override
	public void open() {
		super.context.setLiftState(Context.openningState);
		super.context.open();
	}

	@Override
	public void close() {}

	@Override
	public void run() {
		super.context.setLiftState(Context.runningState);
		super.context.run();
	}

	@Override
	public void stop() {
		System.out.println("lift stop..");
	}

}

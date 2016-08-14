package com.wetts.designpattern.state.example;

public class ClosingState extends LiftState {

	@Override
	public void open() {
		super.context.setLiftState(Context.openningState);
		super.context.open();
	}

	@Override
	public void close() {
		System.out.println("lift close..");
	}

	@Override
	public void run() {
		super.context.setLiftState(Context.runningState);
		super.context.run();
	}

	@Override
	public void stop() {
		super.context.setLiftState(Context.stoppingState);
		super.context.stop();
	}

}

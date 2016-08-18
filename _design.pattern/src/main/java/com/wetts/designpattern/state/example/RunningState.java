package com.wetts.designpattern.state.example;

public class RunningState extends LiftState {

	@Override
	public void open() {}

	@Override
	public void close() {}

	@Override
	public void run() {
		System.out.println("lift run..");
	}

	@Override
	public void stop() {
		super.context.setLiftState(Context.stoppingState);
		super.context.stop();
	}

}

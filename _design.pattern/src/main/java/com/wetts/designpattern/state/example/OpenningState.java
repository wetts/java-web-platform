package com.wetts.designpattern.state.example;

public class OpenningState extends LiftState {

	@Override
	public void open() {
		System.out.println("lift open..");
	}

	@Override
	public void close() {
		super.context.setLiftState(Context.closingState);
		super.context.close();
	}

	@Override
	public void run() {}

	@Override
	public void stop() {}

}

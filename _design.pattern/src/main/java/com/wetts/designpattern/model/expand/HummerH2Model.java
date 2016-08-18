package com.wetts.designpattern.model.expand;

public class HummerH2Model extends HummerModel {

	@Override
	protected void start() {
		System.out.println("Hummer H2 start..");
	}

	@Override
	protected void stop() {
		System.out.println("Hummer H2 stop..");
	}

	@Override
	protected void alarm() {
		System.out.println("Hummer H2 alarm..");
	}

	@Override
	protected void engineBoom() {
		System.out.println("Hummer H2 engineBoom..");
	}
	
	@Override
	protected boolean isAlarm() {
		return false;
	}

}

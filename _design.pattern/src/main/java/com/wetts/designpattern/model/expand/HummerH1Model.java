package com.wetts.designpattern.model.expand;

public class HummerH1Model extends HummerModel {

	private boolean alarmFlag = true;
	
	@Override
	protected void start() {
		System.out.println("Hummer H1 start..");
	}

	@Override
	protected void stop() {
		System.out.println("Hummer H1 stop..");
	}

	@Override
	protected void alarm() {
		System.out.println("Hummer H1 alarm..");
	}

	@Override
	protected void engineBoom() {
		System.out.println("Hummer H1 engineBoom..");
	}
	
	@Override
	protected boolean isAlarm() {
		return alarmFlag;
	}
	
	public void setAlarm(boolean flag) {
		this.alarmFlag = flag;
	}

}

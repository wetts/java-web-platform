package com.wetts.designpattern.model.example;

public abstract class HummerModel {

	public abstract void start();
	
	public abstract void stop();
	
	public abstract void alarm();
	
	public abstract void engineBoom();
	
	public void run() {
		this.start();
		this.engineBoom();
		this.alarm();
		this.stop();
	}
}

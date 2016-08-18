package com.wetts.designpattern.builder.common.car;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {

	private List<String> sequence = new ArrayList<String>();
	
	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void engineBoom();
	
	final public void run() {
		for (int i = 0; i < sequence.size(); i++) {
			String actionName = this.sequence.get(i);
			if("start".equals(actionName)) {
				this.start();
			} else if("stop".equals(actionName)) {
				this.stop();
			} else if("alarm".equals(actionName)) {
				this.alarm();
			} else if("engineBoom".equals(actionName)) {
				this.engineBoom();
			}
		} 
	}
	
	public final void setSequence(List<String> sequence) {
		this.sequence = sequence;
	}
}

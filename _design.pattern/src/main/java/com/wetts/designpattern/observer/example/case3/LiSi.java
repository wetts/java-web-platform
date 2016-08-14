package com.wetts.designpattern.observer.example.case3;

public class LiSi implements Observer {

	@Override
	public void update(String context) {
		System.out.println("LiSi update..");
		this.reportToQinShiHuang(context);
		System.out.println("done");
	}
	
	private void reportToQinShiHuang(String reportContext) {
		System.out.println("LiSi: " + reportContext);
	}

}

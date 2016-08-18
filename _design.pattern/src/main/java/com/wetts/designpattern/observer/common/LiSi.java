package com.wetts.designpattern.observer.common;

public class LiSi implements ILiSi {

	@Override
	public void update(String context) {
		System.out.println("LiSi update..");
		this.reportToQinShiHuang(context);
		System.out.println("done");
	}
	
	private void reportToQinShiHuang(String reportContext) {
		System.out.println("report: " + reportContext);
	}

}

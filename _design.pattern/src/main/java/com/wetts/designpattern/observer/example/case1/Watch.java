package com.wetts.designpattern.observer.example.case1;

import com.wetts.designpattern.observer.common.LiSi;

public class Watch extends Thread {

	private HanFeiZi hanFeiZi;

	private LiSi lisi;

	private String type;

	public Watch(HanFeiZi hanFeiZi, LiSi lisi, String type) {
		this.hanFeiZi = hanFeiZi;
		this.lisi = lisi;
		this.type = type;
	}

	@Override
	public void run() {
		while(true) {
			if (this.type.equals("breakfast")) {
				if(this.hanFeiZi.isHavingBreakfast()) {
					this.lisi.update("hanFeiZi have breakfast..");
					this.hanFeiZi.setHavingBreakfast(false);
				} 
			} else {
				if (this.hanFeiZi.isHavingFun()) {
					this.lisi.update("hanFeiZi hava fun..");
					this.hanFeiZi.setHavingFun(false);
				}
			}
		}
	}
}

package com.wetts.designpattern.observer.example.case1;

import com.wetts.designpattern.observer.common.LiSi;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		LiSi liSi = new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		Watch watchBreakfast = new Watch(hanFeiZi, liSi, "breakfast");
		watchBreakfast.start();
		Watch watchFun = new Watch(hanFeiZi, liSi, "fun");
		watchFun.start();
		Thread.sleep(1000);
		hanFeiZi.haveBreakfast();
		Thread.sleep(1000);
		hanFeiZi.haveFun();
	}
}

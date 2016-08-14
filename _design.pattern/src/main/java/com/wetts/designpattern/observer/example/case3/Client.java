package com.wetts.designpattern.observer.example.case3;

public class Client {

	public static void main(String[] args) {
		Observer liSi = new LiSi();
		Observer wangSi = new WangSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		hanFeiZi.addObserver(wangSi);
		hanFeiZi.addObserver(liSi);
		hanFeiZi.haveBreakfast();
	}
}

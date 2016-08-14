package com.wetts.designpattern.observer.example.case2;

import com.wetts.designpattern.observer.common.IHanFeiZi;

public class Client {

	public static void main(String[] args) {
		IHanFeiZi hanFeiZi = new HanFeiZi();
		hanFeiZi.haveBreakfast();
		hanFeiZi.haveFun();
	}
}

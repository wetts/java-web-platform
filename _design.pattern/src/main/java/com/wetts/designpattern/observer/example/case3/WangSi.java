package com.wetts.designpattern.observer.example.case3;

public class WangSi implements Observer {

	@Override
	public void update(String context) {
		System.out.println("WangSi cry..");
		System.out.println(context);
	}

}

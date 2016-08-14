package com.wetts.designpattern.observer.example.case3;

import com.wetts.designpattern.observer.common.IHanFeiZi;

import java.util.ArrayList;
import java.util.List;

public class HanFeiZi implements Observable, IHanFeiZi {

	private List<Observer> observerList = new ArrayList<Observer>();
	
	@Override
	public void haveBreakfast() {
		System.out.println("HanFeiZi have breakfast..");
		this.notifyObserver("HanFeiZi have breakfast..");
	}

	@Override
	public void haveFun() {
		System.out.println("HanFeiZi have fun..");
		this.notifyObserver("HanFeiZi have fun..");
	}

	@Override
	public void addObserver(Observer observer) {
		this.observerList.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		this.observerList.remove(observer);
	}

	@Override
	public void notifyObserver(String context) {
		for(Observer observer : observerList) {
			observer.update(context);
		}
	}

}

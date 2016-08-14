package com.wetts.designpattern.observer.example.case3;

public interface Observable {

	public void addObserver(Observer observer);
	
	public void deleteObserver(Observer observer);
	
	public void notifyObserver(String context);
}

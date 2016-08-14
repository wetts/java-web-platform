package com.wetts.designpattern.memento.normal;

public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		
		caretaker.setMemento(originator.createMemento());
		originator.restoreMemento(caretaker.getMemento());
	}
}

package com.wetts.designpattern.memento.expand.lotsState;

public class Client {

	public static void main(String[] args) {
		Originator ori = new Originator();
		Caretaker caretaker = new Caretaker();
		ori.setState1("momo");
		ori.setState2("aa");
		ori.setState3("bb");
		caretaker.setMemento(ori.createMemento());
		ori.setState1("dd");
		ori.setState2("ee");
		ori.setState3("ff");
		ori.restoreMemento(caretaker.getMemento());
	}
}

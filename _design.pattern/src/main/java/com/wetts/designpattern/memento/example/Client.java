package com.wetts.designpattern.memento.example;

public class Client {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		
		Boy boy = new Boy();
		boy.setState("happy");
		System.out.println(boy.getState());
		
		caretaker.setMemento(boy.createMemento());
		
		boy.changeState();
		System.out.println(boy.getState());
		
		boy.restoreMemento(caretaker.getMemento());
		
		System.out.println(boy.getState());
		
	}
}

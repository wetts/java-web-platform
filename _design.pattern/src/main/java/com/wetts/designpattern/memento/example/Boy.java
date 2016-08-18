package com.wetts.designpattern.memento.example;

import com.wetts.designpattern.memento.common.Memento;

public class Boy {

	private String state = "";
	
	public void changeState() {
		this.state = "bad";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento() {
		return new Memento(this.state);
	}
	
	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}
}

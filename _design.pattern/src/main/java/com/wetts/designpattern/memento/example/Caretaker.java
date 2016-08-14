package com.wetts.designpattern.memento.example;

import com.wetts.designpattern.memento.common.Memento;

public class Caretaker {

	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}

package com.wetts.designpattern.memento.expand.safe;

public class Caretaker {

	private IMemento memento;

	public IMemento getMemento() {
		return memento;
	}

	public void setMemento(IMemento memento) {
		this.memento = memento;
	}
	
}

package com.wetts.designpattern.memento.expand.safe;

public class Originator {

	private String state = "";

	public void setState(String state) {
		this.state = state;
	}

	public IMemento createMemento() {
		return new Memento(this.state); 
	}
	
	public void restoreMemento(IMemento memento) {
		this.setState(((Memento)memento).getState());
	}
	
	private class Memento implements IMemento {
		
		private String state = "";
		
		private Memento(String state) {
			this.state = state;
		}

		public String getState() {
			return state;
		}

	}
	
}

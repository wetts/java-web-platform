package com.wetts.designpattern.decorator.normal;

public abstract class Decorator extends Component {

	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void operate() {
		this.component.operate();
	}

}

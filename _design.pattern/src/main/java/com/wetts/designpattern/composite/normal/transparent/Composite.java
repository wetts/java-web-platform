package com.wetts.designpattern.composite.normal.transparent;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<Component> componentList = new ArrayList<Component>();
	
	public void add(Component component) {
		componentList.add(component);
	}
	
	public void remove(Component component) {
		this.componentList.remove(component);
	}

	public List<Component> getChildren() {
		return this.componentList;
	}
	
	@Override
	public void doSomething() {
		System.out.println("Composite doSomething..");
	}

}

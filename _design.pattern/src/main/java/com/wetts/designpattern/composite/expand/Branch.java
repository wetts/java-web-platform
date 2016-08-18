package com.wetts.designpattern.composite.expand;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Corp {

	private List<Corp> subordinateList = new ArrayList<Corp>(); 
	
	public Branch(String name, String position, int salary) {
		super(name, position, salary);
	}
	
	public void addSuboradinate(Corp corp) {
		corp.setParent(this);
		this.subordinateList.add(corp);
	}
	
	public List<Corp> getSubordinate() {
		return subordinateList;
	}

}

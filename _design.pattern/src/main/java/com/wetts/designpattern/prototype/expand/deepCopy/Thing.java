package com.wetts.designpattern.prototype.expand.deepCopy;

import java.util.ArrayList;
import java.util.List;

public class Thing implements Cloneable {

	private ArrayList<String> list = new ArrayList<String>();
	
	public Thing clone() {
		Thing thing = null;
		try {
			thing = (Thing)super.clone();
			thing.list = (ArrayList<String>) this.list.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return thing;
	}
	
	public void setValue(String value) {
		list.add(value);
	}
	
	public List<String> getList() {
		return list;
	}
}

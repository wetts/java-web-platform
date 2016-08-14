package com.wetts.designpattern.prototype.normal;

public class PrototypeClass implements Cloneable {

	protected PrototypeClass clone() {
		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototypeClass;
	}
}

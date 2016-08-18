package com.wetts.designpattern.iterator.normal;

import java.util.Vector;

public class ConcreteAggregate<T> implements Aggregate<T> {

	private Vector<T> vector = new Vector<T>();
	
	@Override
	public void add(T object) {
		this.vector.add(object);
	}

	@Override
	public void remove(T object) {
		this.vector.remove(object);
	}

	@Override
	public Iterator<T> iteractor() {
		return new ConcreteIterator<T>(vector);
	}

}

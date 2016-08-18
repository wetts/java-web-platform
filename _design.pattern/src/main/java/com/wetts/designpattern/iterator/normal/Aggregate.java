package com.wetts.designpattern.iterator.normal;

public interface Aggregate<T> {

	public void add(T object);
	
	public void remove(T object);
	
	public Iterator<T> iteractor();
}

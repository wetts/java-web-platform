package com.wetts.designpattern.iterator.normal;

public interface Iterator<T> {

	public T next();
	
	public boolean hasNext();
	
	public boolean remove();
}

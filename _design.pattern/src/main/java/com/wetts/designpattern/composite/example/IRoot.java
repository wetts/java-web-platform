package com.wetts.designpattern.composite.example;

import java.util.List;

public interface IRoot {

	public String getInfo();
	
	public void add(IBranch branch);
	
	public void add(ILeaf leaf);
	
	public List<Object> getSubordinateInfo();
}

package com.wetts.designpattern.visitor.common;

public interface IVisitor {

	public void visit(CommonEmployee commonEmployee);
	
	public void visit(Manager manager);
}

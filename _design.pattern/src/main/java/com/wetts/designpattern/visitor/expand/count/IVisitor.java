package com.wetts.designpattern.visitor.expand.count;

import com.wetts.designpattern.visitor.common.CommonEmployee;
import com.wetts.designpattern.visitor.common.Manager;

public interface IVisitor {

	public void visit(CommonEmployee commonEmployee);
	
	public void visit(Manager manager);
}

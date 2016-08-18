package com.wetts.designpattern.command.example;

import com.wetts.designpattern.command.common.group.CodeGroup;
import com.wetts.designpattern.command.common.group.Group;
import com.wetts.designpattern.command.common.group.PageGroup;
import com.wetts.designpattern.command.common.group.RequirementGroup;

public abstract class Command {

	protected Group requirementGroup = new RequirementGroup();
	
	protected Group pageGroup = new PageGroup();
	
	protected Group codeGroup = new CodeGroup();
	
	public abstract void execute();
}

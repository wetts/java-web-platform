package com.wetts.designpattern.command.example;

public class AddRequirementCommand extends Command {

	@Override
	public void execute() {
		super.requirementGroup.find();
		super.requirementGroup.add();
		super.requirementGroup.plan();
	}

}

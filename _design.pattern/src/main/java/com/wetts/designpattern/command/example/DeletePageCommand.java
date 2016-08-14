package com.wetts.designpattern.command.example;

public class DeletePageCommand extends Command {

	@Override
	public void execute() {
		super.pageGroup.find();
		super.requirementGroup.delete();
		super.requirementGroup.plan();
	}

}

package com.wetts.designpattern.command.common.group;

public class RequirementGroup extends Group {

	@Override
	public void find() {
		System.out.println("Find requirement group..");
	}

	@Override
	public void add() {
		System.out.println("Add requirement..");
	}

	@Override
	public void delete() {
		System.out.println("Delete requirement..");
	}

	@Override
	public void change() {
		System.out.println("Change requirement..");
	}

	@Override
	public void plan() {
		System.out.println("Plan requirement..");
	}

}

package com.wetts.designpattern.command.common.group;

public class PageGroup extends Group {

	@Override
	public void find() {
		System.out.println("Find page group..");
	}

	@Override
	public void add() {
		System.out.println("Add page..");
	}

	@Override
	public void delete() {
		System.out.println("Delete page..");
	}

	@Override
	public void change() {
		System.out.println("Change page..");
	}

	@Override
	public void plan() {
		System.out.println("Plan page..");
	}

}

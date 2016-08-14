package com.wetts.designpattern.composite.expand;

public abstract class Corp {

	private String name = "";
	
	private String position = "";
	
	private int salary = 0;
	
	private Corp parent = null;

	public Corp(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	public String getInfo() {
		String info = "";
		info = "姓名：" + name;
		info = info + "职位：" + position;
		info = info + "薪水：" + salary;
		return info;
	}
	
	protected void setParent(Corp parent) {
		this.parent = parent;
	}
	
	public Corp getParent() {
		return parent;
	}
	
}

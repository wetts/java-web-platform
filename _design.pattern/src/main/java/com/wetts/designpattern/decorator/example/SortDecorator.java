package com.wetts.designpattern.decorator.example;

import com.wetts.designpattern.decorator.common.report.SchoolReport;

public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport sr) {
		super(sr);
	}

	private void reportSort() {
		System.out.println("我是排名第38名");
	}
	
	@Override
	public void report() {
		super.report();
		this.reportSort();
	}
	
}

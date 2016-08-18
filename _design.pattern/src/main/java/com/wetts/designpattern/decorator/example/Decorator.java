package com.wetts.designpattern.decorator.example;

import com.wetts.designpattern.decorator.common.report.SchoolReport;

public abstract class Decorator extends SchoolReport {

	private SchoolReport sr;
	
	public Decorator(SchoolReport sr) {
		this.sr = sr;
	}
	
	@Override
	public void report() {
		this.sr.report();
	}

	@Override
	public void sign(String name) {
		this.sr.sign(name);
	}

}

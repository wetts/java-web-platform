package com.wetts.designpattern.decorator.example;

import com.wetts.designpattern.decorator.common.report.SchoolReport;

public class HighScoreDecorator extends Decorator {

	public HighScoreDecorator(SchoolReport sr) {
		super(sr);
	}
	
	private void reportHighScore() {
		System.out.println("这次语文最高是75，数学是78，自然是80");
	}
	
	@Override
	public void report() {
		this.reportHighScore();
		super.report();
	}

}

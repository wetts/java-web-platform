package com.wetts.designpattern.decorator.example;

import com.wetts.designpattern.decorator.common.report.FouthGradeSchoolReport;
import com.wetts.designpattern.decorator.common.report.SchoolReport;

public class Father {

	public static void main(String[] args) {
		SchoolReport sr = new FouthGradeSchoolReport();
		sr = new HighScoreDecorator(sr);
		sr = new SortDecorator(sr);
		sr.report();
		sr.sign("momo");
	}
}

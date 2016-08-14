package com.wetts.designpattern.mediator.example;

public class AbstractColleague {

	protected AbstractMediator mediator;
	
	public AbstractColleague(AbstractMediator mediator) {
		this.mediator = mediator;
	}
}

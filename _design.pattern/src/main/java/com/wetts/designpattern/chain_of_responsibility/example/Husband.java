package com.wetts.designpattern.chain_of_responsibility.example;

import com.wetts.designpattern.chain_of_responsibility.common.women.IWomen;

public class Husband extends Handler {

	public Husband() {
		super(Handler.HUSBAND_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("women request: " + women.getRequest());
		System.out.println("Husband accept");
	}


}

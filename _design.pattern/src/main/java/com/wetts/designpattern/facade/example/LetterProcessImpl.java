package com.wetts.designpattern.facade.example;

public class LetterProcessImpl implements ILetterProcess {

	@Override
	public void writeContext(String context) {
		System.out.println("The context is " + context);
	}

	@Override
	public void fillEnvelope(String address) {
		System.out.println("The address is " + address);
	}

	@Override
	public void letterIntoEnvelope() {
		System.out.println("Put letter into envelope");
	}

	@Override
	public void sendLetter() {
		System.out.println("Send letter");
	}

}

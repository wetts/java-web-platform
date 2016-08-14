package com.wetts.designpattern.facade.example;

public class Police {

	public void checkLetter(ILetterProcess letterProcess) {
		System.out.println(letterProcess + " is been checked..");
	}
}

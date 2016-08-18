package com.wetts.designpattern.facade.example;

public class Client {

	public static void main(String[] args) {
		ModernPostOffice hellRoadPostOffice = new ModernPostOffice();
		String address = "Shanghai Pudong";
		String context = "Hello, bye.";
		hellRoadPostOffice.sendLetter(context, address);
	}
}

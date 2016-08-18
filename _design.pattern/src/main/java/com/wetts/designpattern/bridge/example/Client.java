package com.wetts.designpattern.bridge.example;

public class Client {

	public static void main(String[] args) {
		House house = new House();
		HouseCorp houseCorp = new HouseCorp(house);
		houseCorp.makeMoney();
		
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
		shanZhaiCorp.makeMoney();
	}
}

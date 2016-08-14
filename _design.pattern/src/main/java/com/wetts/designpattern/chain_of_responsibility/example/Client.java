package com.wetts.designpattern.chain_of_responsibility.example;

import com.wetts.designpattern.chain_of_responsibility.common.women.IWomen;
import com.wetts.designpattern.chain_of_responsibility.common.women.Women;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

	public static void main(String[] args) {
		Random rand = new Random();
		List<IWomen> list = new ArrayList<IWomen>();
		for (int i = 0; i < 5; i++) {
			list.add(new Women(rand.nextInt(3) + 1, "shopping"));
		}
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		father.setNext(husband);
		husband.setNext(son);
		for (IWomen women : list) {
			father.HandlerMessage(women);
		}
	}
}

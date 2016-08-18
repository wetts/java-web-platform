package com.wetts.designpattern.iterator.normal;

public class Client {

	public static void main(String[] args) {
		Aggregate<String> agg = new ConcreteAggregate<String>();
		agg.add("11");
		agg.add("22");
		agg.add("33");
		Iterator<String> iterator = agg.iteractor();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

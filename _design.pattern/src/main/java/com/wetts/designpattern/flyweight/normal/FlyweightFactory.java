package com.wetts.designpattern.flyweight.normal;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private static Map<String, Flyweight> pool = new HashMap<String, Flyweight>();
	
	public static Flyweight getFlyweight(String Extrinsic) {
		Flyweight flyweight = null;
		if(pool.containsKey(Extrinsic)) {
			flyweight = pool.get(Extrinsic);
		} else {
			flyweight = new ConcreteFlyweight1(Extrinsic);
			pool.put(Extrinsic, flyweight);
		}
		return flyweight;
	}
}

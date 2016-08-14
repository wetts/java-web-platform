package com.wetts.designpattern.flyweight.example;

import java.util.HashMap;
import java.util.Map;

public class SignInfoFactory {

	private static Map<String, SignInfo> pool = new HashMap<String, SignInfo>();
	
	@Deprecated
	public static SignInfo getSignInfo() {
		return new SignInfo();
	}
	
	public static SignInfo getSignInfo(String key) {
		SignInfo result = null;
		if(!pool.containsKey(key)) {
			System.out.println(key + "建立对象");
			result = new SignInfo4Pool(key);
			pool.put(key, result);
		} else {
			result = pool.get(key);
			System.out.println(key + "直接从池中取得");
		}
		return result;
	}
}

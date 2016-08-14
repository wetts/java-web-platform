package com.wetts.designpattern.adapter.expand;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo {

	@Override
	public Map<String, String> getUserBaseInfo() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", "momo");
		map.put("mobile number", "123456789");
		return map;
	}

}

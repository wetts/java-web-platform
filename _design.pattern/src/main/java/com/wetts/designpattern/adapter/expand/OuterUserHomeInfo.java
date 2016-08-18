package com.wetts.designpattern.adapter.expand;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {

	@Override
	public Map<String, String> getUserHomeInfo() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("homeTelNumber", "12345");
		map.put("homeAddress", "Shenzhen");
		return map;
	}

}

package com.wetts.designpattern.adapter.expand;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

	@Override
	public Map<String, String> getUserOfficeInfo() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("jobPosition", "master");
		map.put("officeTelNumber", "123456789");
		return map;
	}

}

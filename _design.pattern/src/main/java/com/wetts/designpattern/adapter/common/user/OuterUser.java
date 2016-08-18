package com.wetts.designpattern.adapter.common.user;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

	@Override
	public Map<String, String> getUserBaseInfo() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", "momo");
		map.put("mobile number", "123456789");
		return map;
	}

	@Override
	public Map<String, String> getUserOfficeInfo() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("jobPosition", "master");
		map.put("officeTelNumber", "123456789");
		return map;
	}

	@Override
	public Map<String, String> getUserHomeInfo() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("homeTelNumber", "12345");
		map.put("homeAddress", "Shenzhen");
		return map;
	}

}

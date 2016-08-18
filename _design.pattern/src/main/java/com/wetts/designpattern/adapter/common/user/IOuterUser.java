package com.wetts.designpattern.adapter.common.user;

import java.util.Map;

public interface IOuterUser {

	public Map<String, String> getUserBaseInfo();
	
	public Map<String, String> getUserOfficeInfo();
	
	public Map<String, String> getUserHomeInfo();
}

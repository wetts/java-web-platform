package com.wetts._basic.inherit;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 方法重写演示
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class OverrideDemo {

}

class Father {
	
	protected Object test() throws IOException {
		return null;
	}
}

class Son extends Father {
	
	@Override
	public Integer test() throws FileNotFoundException {
		return null;
	}
}

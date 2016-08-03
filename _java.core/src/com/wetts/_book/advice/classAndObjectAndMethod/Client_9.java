package com.wetts._book.advice.classAndObjectAndMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用匿名类的构造函数
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_9 {

	@SuppressWarnings({ "unused", "serial" })
	public static void main(String[] args) {
		List<Object> l1 = new ArrayList<Object>();
		List<Object> l2 = new ArrayList<Object>(){};
		List<Object> l3 = new ArrayList<Object>(){{}};
	}
}

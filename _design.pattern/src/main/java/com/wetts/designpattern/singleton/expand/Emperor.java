package com.wetts.designpattern.singleton.expand;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 单例模式的扩展
 * 
 * @author wetts
 * @since 1.0 2015/05/26
 */
public class Emperor {

	private static int maxNumOfEmperor = 2;
	
	private static List<String> nameList = new ArrayList<String>();
	
	private static List<Emperor> emperorList = new ArrayList<Emperor>();
	
	private static int countNumOfEmperor = 0;
	
	static {
		for(int i = 0; i < maxNumOfEmperor; i++) {
			emperorList.add(new Emperor("皇" + (i + 1) + "帝"));
		}
	}
	
	private Emperor() {}
	
	private Emperor(String name) {
		nameList.add(name);
	}
	
	public static Emperor getInstance() {
		Random random = new Random();
		countNumOfEmperor = random.nextInt(maxNumOfEmperor);
		return emperorList.get(countNumOfEmperor);
	}
	
	public static void say() {
		System.out.println(nameList.get(countNumOfEmperor));
	}
}

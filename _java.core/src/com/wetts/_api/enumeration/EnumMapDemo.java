package com.wetts._api.enumeration;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class EnumMapDemo {

	public static void main(String[] args) {
		// EnumMap的使用
		EnumMap<Color, String> colors = new EnumMap<Color, String>(Color.class);
		colors.put(Color.RED, "红色");
		colors.put(Color.BLACK, "黑色");
		// ... ...
		for(Iterator<Entry<Color, String>> iter = colors.entrySet().iterator(); iter.hasNext();) {
			Entry<Color, String> entry = iter.next();
			System.out.println(entry.getKey().name() + ":" + entry.getValue());
		}
	}

}

package com.wetts._api.enumeration;

import java.util.EnumSet;

public class EnumSetDemo {
	
	public static void main(String[] args) {
		EnumSet<Color> colors = EnumSet.allOf(Color.class);
        for (Color color : colors) {
            System.out.println(color);
        }
	}

}

package com.wetts._api.time.date;

import java.util.Date;

/**
 * Date只用来存储日期
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		long l = date.getTime();
		System.out.println(l);
	}
}

package com.wetts._api.time.calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class CalendarDemo {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		System.out.println(date);
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, 1);
		date = calendar.getTime();
		System.out.println(date);
	}
}

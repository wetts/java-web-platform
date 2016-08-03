package com.wetts._api.time.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 两种得到Calendar对象的方法
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class InstanceCalendarDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 1
		Calendar c1 = new GregorianCalendar(1998, Calendar.JANUARY, 20);
		// 2
		Calendar c2 = Calendar.getInstance();
	}
}

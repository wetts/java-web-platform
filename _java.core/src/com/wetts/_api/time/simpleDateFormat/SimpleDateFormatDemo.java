package com.wetts._api.time.simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class SimpleDateFormatDemo {

	public static void main(String[] args) throws ParseException {
		String format = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse("1991-10-20");
		System.out.println(date);
		String d = sdf.format(date);
		System.out.println(d);
	}
}

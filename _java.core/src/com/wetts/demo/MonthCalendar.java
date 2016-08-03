package com.wetts.demo;

/**
 * 得出xxxx年xx月的日历(1900年以后)
 * 
 * @author wetts
 * @since 1.0, 2014/08/28
 */
public class MonthCalendar {

	public static void main(String[] args) {
		calender(2014, 8);
	}
	
	public static void calender(int year, int month) {
		int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sumDay = 0;
		int monthDay = 0;
		int index = 1;
		for (int i = 1900; i < year; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				sumDay += 366;
			} else {
				sumDay += 365;
			}
		}
		for (int i = 0; i < month - 1; i++) {
			if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && i == 2) {
				sumDay += mon[i] + 1;
			} else {
				sumDay += mon[i];
			}
		}
		if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month == 2) {
			monthDay = mon[month - 1] + 1;
		} else {
			monthDay = mon[month - 1];
		}
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		if (sumDay % 7 != 6) {
			System.out.print(" \t");
			for (int i = 0; i < sumDay % 7; i++) {
				System.out.print(" \t");
				index++;
			}
		} else {
			index = 0;
		}
		for (int i = 1; i <= monthDay; i++) {
			System.out.print(i + "\t");
			index++;
			if (index == 7) {
				System.out.println();
				index = 0;
			}
		}
	}
}

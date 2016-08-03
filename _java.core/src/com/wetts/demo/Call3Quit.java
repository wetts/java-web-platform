package com.wetts.demo;

/**
 * 一个队列，数到3的倍数的人退出，得出最后一个人是哪个
 * 
 * @author wetts
 * @since 1.0, 2014/08/28
 */
public class Call3Quit {

	public static void main(String[] args) {
		System.out.println(lastOne(100));
	}
	
	public static int lastOne(int num) {
		boolean[] listBoolean = new boolean[num];
		int sum = num;
		int lastOne = -1;
		int index = 0;
		while (sum != 1) {
			for (int i = 0; i < listBoolean.length; i++) {
				if (!listBoolean[i]) {
					index++;
					if (index == 3) {
						listBoolean[i] = true;
						index = 0;
						sum--;
					} else {
						lastOne = i + 1;
					}
				}
			}
		}
		return lastOne;
	}
}

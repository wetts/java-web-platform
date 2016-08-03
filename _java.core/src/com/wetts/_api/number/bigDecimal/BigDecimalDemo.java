package com.wetts._api.number.bigDecimal;

import java.math.BigDecimal;

/**
 * 
 * @author wetts
 * @created 2015/06/06
 *
 */
public class BigDecimalDemo {

	public static void main(String[] args) {
		String num1 = "151221511241241412441424124141412453426346364";
		String num2 = "0.000000000000000000000000000000000000000000000000000213";
		System.out.println(new BigDecimal(num1).subtract(new BigDecimal(num2)).toString());
	}
}

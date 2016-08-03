package com.wetts._book.advice.enumAnnotation;

/**
 * 小心switch带来的空值异常
 * 
 * @author wetts
 * @created 2015/06/13
 *
 */
public class Client_3 {

	public static void main(String[] args) {
		doSports(null);
	}
	
	public static void doSports(Season season) {
		switch (season) {
		case Spring:
			System.out.println("Spring");
			break;
		case Summer:
			System.out.println("Summer");
			break;
		case Autumn:
			System.out.println("Autumn");
			break;
		case Winter:
			System.out.println("Winter");
			break;
		default:
			break;
		}
	}
	
	/**
	 * 上面的方法编译后等价于下面
	 */
//	public static void doSports_(Season season) {
//		switch (season.ordinal()) {
//		case Season.Spring.ordinal():
//			
//			break;
//		case Season.Summer.ordinal():
//			
//			break;
//		case Season.Autumn.ordinal():
//			
//			break;
//		case Season.Winter.ordinal():
//			
//			break;
//
//		default:
//			break;
//		}
//	}
}


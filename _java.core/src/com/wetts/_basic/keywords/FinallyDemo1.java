package com.wetts._basic.keywords;

/**
 * finally块
 * 无论程序是否出错，都要执行的代码片段
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class FinallyDemo1 {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			System.out.println("开始链接数据库");
			System.out.println("开始保存数据");
			System.out.println("保存完毕" + Integer.parseInt("a"));
		} catch (Exception e) {
			System.out.println("出错了");
		} finally {
			System.out.println("与数据库断开链接");
		}
		System.out.println("程序结束");
	}
}

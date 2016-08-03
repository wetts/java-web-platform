package com.wetts._api.containter.deque;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列
 * 通常我们使用双端队列用于实现栈结构
 * 栈的特点 先进后出 FILO
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class DequeDemo {

	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		System.out.println(stack);
//		String e = stack.pop();
//		System.out.println(e);
//		System.out.println(stack);
		while (stack.size() > 0) {
			String e = stack.pop();
			System.out.println(e);
		}
		System.out.println(stack);
	}
}

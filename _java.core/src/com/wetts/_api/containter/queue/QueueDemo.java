package com.wetts._api.containter.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列
 * 用于存储一组数据
 * 存取元素必须遵循先进先出原则 
 * FIFO
 * 
 * @author wetts
 * @since 1.0, 2014/07/31
 */
public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		System.out.println(queue);
//		String e = queue.poll();
//		String e = queue.peek();
//		System.out.println(queue);
		/*
		 * 遍历队列的时候，应注意方式
		 * 不要每次性能文队列长度作为循环条件，
		 * 因为队列的长度在遍历过程中是发生改变的。
		 */
//		for (int i = queue.size(); i > 0; i--) {
//			System.out.println(queue.poll());
//		}
//		System.out.println(queue);
		String str = null;
		while ((str = queue.poll()) != null) {
			 System.out.println(str);
		}
	}
}

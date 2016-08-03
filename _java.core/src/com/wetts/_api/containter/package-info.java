/**
 * 
 * 
 ****************************************************
 * List
 * 	通过Arrays.asList方法转换的集合是一个只读的
 * 
 * 	subList()方法
 * 		对子集合的修改，会影响原集合
 * 
 * Vector与ArrayList
 * 	Vector
 * 		线程安全
 * 	ArrayList
 * 		非线程安全
 * 
 * LinkedList与ArrayList区别：
 * 	LinkedList
 * 		更适合于随机访问
 * 	ArrayList
 * 		更适合于插入和删除
 * 
 ****************************************************
 * Set
 * 	HashSet
 * 		元素不能重复
 * 		需要hashCode和equals都相同才算是重复
 * 
 ****************************************************
 * Iterator<E>
 * 	不能在遍历的时候，调用E的remove方法，只能调用Iterator的remove方法
 * 
 */
/**
 * @author wetts
 * @created 2015/06/06
 *
 */
package com.wetts._api.containter;

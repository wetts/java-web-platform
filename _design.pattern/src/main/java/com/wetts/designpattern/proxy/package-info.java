/**
 * 代理模式（Proxy Pattern）
 * 也叫委托模式，是一项基本设计技巧。
 * 定义：Provide a surrogate or placeholder for another object to control access to it.（为其他对象提供一种代理以控制对这个对象的访问。）
 * <p>
 * ---
 * 代理模式的优点：
 * 责任清晰；
 * 高扩展性；
 * 智能化。
 * <p>
 * ---
 * 普通代理
 * 强制代理
 * 虚拟代理
 * 动态代理
 * 在实现阶段不用关心代理谁，而在运行阶段才指定代理哪一个对象。
 * Spring AOP是一个非常典型的动态代理。
 * 代理类实现InvocationHandler
 *
 * @author wetts
 * @created 2015/08/25
 */
package com.wetts.designpattern.proxy;
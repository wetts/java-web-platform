/**
 * 备忘录模式（Memento Pattern）
 * 定义：Without violating encapsulation, capture and externalize an object,s internal state so that the object can be restored to this state later.（在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。）
 * <p>
 * ---
 * 备忘录模式的使用场景：
 * 需要保存和恢复数据的相关状态场景；
 * 提供一个可回滚（rollback）的操作；
 * 需要监控的副本场景；
 * 数据库连接的食物管理就是用的备忘录模式。
 *
 * @author wetts
 * @created 2015/08/25
 */
package com.wetts.designpattern.memento;
/**
 * 访问者模式（Visitor Pattern）
 * 定义：Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.（封装一些作用于某些数据结构中的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作。）
 * <p>
 * ---
 * 访问者模式的优点：
 * 符合单一职责原则；
 * 优秀的扩展性；
 * 灵活性非常高。
 * <p>
 * ---
 * 访问者模式的缺点：
 * 具体元素对访问者公开细节；
 * 具体元素角色的增加、删除、修改都是比较困难的；
 * 违背了依赖倒置原则。
 * <p>
 * ---
 * 访问者模式的使用场景：
 * 业务规则要求遍历多个不同的对象；
 * 充当拦截器角色。
 *
 * @author wetts
 * @created 2015/08/25
 */
package com.wetts.designpattern.visitor;
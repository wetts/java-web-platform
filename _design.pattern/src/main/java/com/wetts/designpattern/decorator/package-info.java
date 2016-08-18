/**
 * 装饰模式（Decorator Pattern）
 * 定义：Attach additional responsibilities to an object dynamically keeping the same interface. Decorators provide a flexible alternative to subclassing for extending functionality.（动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式相比生成子类更为灵活。）
 * <p>
 * 装饰类的作用也就是一个特殊的代理类。
 * <p>
 * ---
 * 装饰模式的优点：
 * 装饰类和被装饰类可以独立发展，而不会相互耦合；
 * 装饰模式是继承关系的一个代替方案；
 * 装饰模式可以动态地扩展一个实现类的功能；
 * 扩展性非常好。
 * <p>
 * ---
 * 装饰模式的缺点：
 * 多层的装饰是比较复杂的。
 *
 * @author wetts
 * @created 2015/08/25
 */
package com.wetts.designpattern.decorator;
/**
 * 原型模式（Prototype Pattern）
 * 定义：Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.（用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。）
 * <p>
 * 简单程度仅次于单例模式和迭代器模式。
 * ---
 * 原型模式的优点：
 * 性能优良；
 * 逃避构造函数的约束。
 * <p>
 * ---
 * 原型模式的使用场景：
 * 资源优化场景；
 * 性能和安全要求的场景；
 * 一个对象多个修改这的场景。
 * <p>
 * ---
 * 原型模式的注意事项：
 * 1、构造函数不会被执行
 * 一个实现了Cloneable并重写了clone方法的A，有一个无参构造或有参构造B，通过new关键字产生了一个对象S，在然后通过S.clone()方式产生了一个新的对象T，那么在对象拷贝时构造函数B是不会被执行的。
 * 2、浅拷贝和深拷贝
 * Object类提供的方法clone只是拷贝本对象，其对象内部的数组、引用对象等都不拷贝，还是指向原生对象的内部元素地址，这种拷贝就叫做浅拷贝。
 * 使用原型模式时，引用的成员变量必须满足两个条件才不会被拷贝：一是类的成员变量，而不是方法内变量；二是必须是一个可变的引用，而不是一个原始类型或不可变对象。
 * 深拷贝：对私有的类变量进行独立的拷贝。
 * 深拷贝和浅拷贝建议不要混合使用。
 * 3、clone和final两个冤家
 * 对象的clone与对象内的final关键字是有冲突的。
 *
 * @author wetts
 * @created 2015/08/25
 */
package com.wetts.designpattern.prototype;
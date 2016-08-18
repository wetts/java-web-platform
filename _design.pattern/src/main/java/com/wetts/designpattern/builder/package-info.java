/**
 * 建造者模式（Builder Pattern）
 * 也叫做生成器模式
 * 定义：Separate the construciton of a complex object from its representation so that the same construction process can create different representations.（将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。）
 * <p>
 * ---
 * 建造者模式的优点：
 * 封装性；
 * 建造者独立，容易扩展；
 * 便于控制细节风险。
 * <p>
 * ---
 * 建造者模式的使用场景：
 * 相同的方法，不同的执行顺序，产生不同的时间结果时；
 * 多个不见或零件，都可以装配到一个对象中，但是产生的执行结果又不相同时；
 * 产品类非常复杂，或者产品类中的调用顺序不同产生了不同的效能；
 * 在对象创建过程中会使用到系统中的一些其他对象，这些对象在产品对象的创建过程中不易得到时。
 * <p>
 * ---
 * 建造者模式的注意事项：
 * 建造者模式关注的是零件类型和装配工艺（顺序）；而工厂方法则重点是创建，创建零件是它的主要职责，组装顺序则不是它关心的。
 *
 * @author wetts
 * @created 2015/08/25
 */
package com.wetts.designpattern.builder;
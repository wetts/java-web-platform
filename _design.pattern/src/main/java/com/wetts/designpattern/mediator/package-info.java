/**
 * 中介者模式（Mediator）
 * 定义：Define an object that encapaulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interation independently.（用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立地改变它们之间的交互。）
 * <p>
 * ---
 * 中介者模式的优点：
 * 减少类间的依赖，把原有的一对多的依赖变成一对一的依赖，同事类依赖中介者，较少了依赖，当然同事也降低了类间的耦合。
 * <p>
 * ---
 * 中介者模式的缺点：
 * 使用不当时复杂程度会被放大。
 * <p>
 * ---
 * 中介者模式的实际应用：
 * 机场调度中心；
 * MVC框架；
 * 媒体网关；
 * 中介服务。
 * <p>
 * ---
 * 以下情况尝试使用中介者模式：
 * N个对象之间产生了相互的依赖（N>2）；
 * 对各对象有依赖关系，但是依赖的行为尚不确定或者有发生改变的可能，在这种情况下一般建议采用中介者模式，降低变更引起的风险扩散；
 * 产品开发。
 *
 * @author wetts
 * @created 2015/08/25
 */
package com.wetts.designpattern.mediator;
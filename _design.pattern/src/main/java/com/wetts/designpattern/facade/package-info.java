/**
 * 门面模式（Facade Pattern）
 * 定义：Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.（要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。门面模式提供一个高层次的接口，使子系统更易于使用。）
 * <p>
 * ---
 * 门面模式的优点：
 * 减少系统的相互依赖；
 * 提高了灵活性；
 * 提高安全性。
 * <p>
 * ---
 * 门面模式的缺点：
 * 不符合开闭原则。
 * <p>
 * ---
 * 门面模式的使用场景：
 * 为了一个复杂的模块或子系统提供一个供外界访问的接口；
 * 子系统相对独立---外界对子系统的访问只要黑箱操作即可；
 * 预防低水平人员带来的风险扩散。
 *
 * @author wetts
 * @created 2015/08/25
 */
package com.wetts.designpattern.facade;
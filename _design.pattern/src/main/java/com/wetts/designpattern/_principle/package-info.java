/**
 * 六大设计原则
 * <p>
 * ********************************************
 * 1> 单一职责原则（Single Responsibility Principle）
 * There should never be more than one reason for a class to change.
 * <p>
 * 2> 里氏替换原则（Liskov Substitution Principle）
 * Define:
 * 1. If for each object o1 of type S there is an object o2 of type T such that for all programs P defined in terms of T, the behavior of P is unchanged when o1 is substitution for o2 then S is a subtype of T.
 * 2. Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it.
 * <p>
 * 3> 依赖倒置原则（Dependence Inversion Principle）
 * High level modules should not depend upon low level modules. Both should depend upon abstraction. Abstractions should not depend upon details. Details should depend upon abstractions.
 * <p>
 * 4> 接口隔离原则（Interface Segregation Principle）
 * Define:
 * 1. Clients should not be forced to depend upon interfaces that they don't use.
 * 2. The dependency of one class to another one should depend on the smallest possible interface.
 * <p>
 * 5> 迪米特法则（Law of Demeter） or 最少知识法则（Least Knowledge Principle）
 * Only talk to your immedate friends.
 * <p>
 * 6> 开闭原则（Open Closed Principle）
 * Software entities like classes, modules and functions should be open for extension but closed for modifications.
 *
 * @author wetts
 * @created 2015/08/25
 */
package com.wetts.designpattern._principle;
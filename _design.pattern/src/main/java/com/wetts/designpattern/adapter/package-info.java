/**
 * 适配器模式（Adapter Pattern）
 * 又叫做变压器模式。也叫做包装模式（Wrapper）。
 * 定义：Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.（将一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。）
 * <p>
 * ---
 * 适配器模式的优点：
 * 适配器模式可以让两个没有任何关系的类在一起运行；
 * 增加了类的透明性；
 * 提高了类的复用度；
 * 灵活性非常好。
 * <p>
 * ---
 * 适配器模式的使用场景：
 * 动机修改一个已经投产中的接口时。
 * <p>
 * ---
 * 适配器模式的注意事项：
 * 最好在详细设计阶段不要考虑它，它不是为了解决还处在开发阶段的问题，而是解决正在服役的项目的问题。
 *
 * @author wetts
 * @created 2015/08/25
 */
package com.wetts.designpattern.adapter;
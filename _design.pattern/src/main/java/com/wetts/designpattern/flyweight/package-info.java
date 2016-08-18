/**
 * 享元模式（Flyweight Pattern）
 * 定义：Use sharing to support large numbers of fine-grained objects efficiently.（使用共享对象可有效地支持大量的细粒度的对象。）
 * <p>
 * ---
 * 要求细粒度对象，那么不可避免地使得对象数量多切性质相近，那我们就将这些对象的信息分为两个部分：内部状态（intrinsic）与外部状态（extrinsic）。
 * 内部状态是对象可共享出来的信息，存储在享元对象内部并且不会随环境改变而改变。
 * 外部状态是独享得以依赖的一个标记，是随环境改变而改变的、不可用共享的状态。
 *
 * @author wetts
 * @created 2015/08/25
 */
package com.wetts.designpattern.flyweight;
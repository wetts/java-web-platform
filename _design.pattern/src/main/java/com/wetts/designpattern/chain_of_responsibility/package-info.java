/**
 * 责任链模式(chain_of_responsibility)
 * 定义：Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.（使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。）
 * <p>
 * ---
 * 责任链模式的优点：
 * 将请求和处理分开。
 * <p>
 * ---
 * 责任链模式的缺点：
 * 性能问题，每个请求都是从链头遍历到链尾。
 * <p>
 * ---
 * 责任链模式的注意事项：
 * 链中节点数量需要控制，避免出现超长链的情况。
 *
 * @author wetts
 * @created 2015/08/25
 */
package com.wetts.designpattern.chain_of_responsibility;
/**
 * 命令模式(command pattern)
 * 定义：Encapsulate a request as an object, thereby letting you patameterize clients with different requests, queue or log requests, and support undoable operations.（将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。）
 * <p>
 * 命令模式是一个高内聚的模式。
 * <p>
 * ---
 * 命令模式的优点：
 * 类间解耦；
 * 可扩展性；
 * 命令模式结合其他模式会更优秀。
 * <p>
 * ---
 * 命令模式的扩展：
 * 在没有执行或执行后撤回
 * 结合备忘录模式还原最后状态；通过增加一个新的命令，实现时间的回滚。
 *
 * @author wetts
 * @created 2015/08/25
 */
package com.wetts.designpattern.command;
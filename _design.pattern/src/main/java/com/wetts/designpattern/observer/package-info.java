/**
 * 观察者模式（Observer Pattern）
 * 也叫做发布订阅模式（Publish/subscribe）
 * 定义：Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.（定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新。）
 * <p>
 * ---
 * 观察者模式的优点：
 * 观察者和被观察者之间是抽象耦合；
 * 建立一套出发机制。
 * <p>
 * ---
 * 观察者模式的缺点：
 * 观察者模式需要考虑一下开发效率和运行效率问题，一个被观察者，多个观察者，开发和调试就会比较复杂，而且在Java中消息的通知默认是顺序执行，一个观察者卡壳，会影响整体的执行效率。在这种情况下，一般考虑采用异步的方式。
 * 多级触发时的效率更是让人担忧。
 * <p>
 * ---
 * 观察者模式的使用场景：
 * 关联行为场景；
 * 事件多级触发场景；
 * 跨系统的消息交换场景。
 * <p>
 * ---
 * 观察者模式的注意事项：
 * 使用观察者模式也有以下两个重点问题要解决：
 * 广播链问题；
 * 异步处理问题。
 * <p>
 * ---
 * Java中的观察者类：
 * java.util.Observable 被观察者
 * java.util.Observer 观察者
 * <p>
 * ---
 * 系统设计中会对观察者模式进行改造或改装，主要在以下3个方面：
 * 观察者和被观察者之间的消息沟通：观察者中的update方法接受两个参数，一个是被观察者，一个是DTO（Data Transfer Object，数据传输对象），DTO一般是一个纯洁的JavaBean，由被观察者生成，由观察者消费。
 * 观察者响应方式：一是采用多线程技术；而是缓存技术。
 * 被观察者尽量自己做主。
 * <p>
 * ---
 * 在实际项目和生活中经常发生的例子：
 * 文件系统；
 * 猫鼠游戏；
 * ATM取钱；
 * 广播收音机。
 *
 * @author wetts
 * @created 2015/08/25
 */
package com.wetts.designpattern.observer;
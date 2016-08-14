/**
 * 工厂方法模式（Factory Pattern）
 * 定义：Define an interface for creating an object,but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.（定义一个用于创建对象的接口，让子类决定实例化哪一个。工厂方法使一个类的实例化延迟到其子类。）
 * <p>
 * ---
 * 工厂方法模式的优点：
 * 良好的封装性，代码机构清晰；
 * 工厂方法模式的扩展性非常优秀；
 * 屏蔽产品类；
 * 是典型的解耦框架。
 * <p>
 * ---
 * 工厂方法模式的扩展：
 * 1、缩小为简单工厂模式
 * 一个模块仅需要一个工厂类，没有必要把它生产出来，使用静态的方法就可以了。
 * 简单工厂模式（Simple Factory Pattern），也叫静态工厂模式。
 * 2、升级为多个工厂类
 * 复杂的应用中一般采用多工厂的方法，然后再增加一个协调类，避免调用者与各个子工厂交流，协调类的作用是封装子工厂类，对高层模块提供统一的访问接口。
 * 3、替代单例模式
 * Class cl = Class.forName("");
 * Constructor constructor = cl.getDeclaredConstructor();
 * constructor.setAccessible(true);
 * constructor.newInstance();
 * 4、延迟初始化
 * 例如定义一个Map容器，容纳所有产生的对象，如果在Map容器中已经有的对象，则直接取出返回；如果没有，则根据需要的类型产生一个对象并放入到Map容器中，以方便下次调用。限制某一个产品类的最大实例化数量，可以通过判断Map中已有的对象数量来实现。
 *
 * @author wetts
 * @created 2015/08/25
 */
package com.wetts.designpattern.factory_method;
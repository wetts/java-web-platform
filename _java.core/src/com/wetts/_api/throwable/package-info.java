/**
 * Error:
 * 	表示Java运行时环境出现的错误
 * 
 * Exception:
 * 	表示由于网络故障、文件损坏、设备错误、用户输入非法等情况导致的异常，
 * 	这类异常是可以通过Java异常捕获机制处理的
 * 
 *******************************************************
 * 用throw抛出异常的一般情况：
 * 	1> 满足语法要求，但不符合业务逻辑
 * 	2> 当前代码片段不应处理该异常
 * 
 *******************************************************
 * 子类重写父类方法时，异常的处理：
 * 	可以
 * 		1：子类重写父类方法时，可以不抛出任何异常
 * 		2：重写时可以仅抛出父类的部分异常
 * 		3：重写时抛出父类抛出异常的子类异常
 * 	不能
 * 		1：抛出额外的异常（父类没有抛出的）
 * 		2：抛出父类方法抛出的异常的父类异常
 * 
 ********************************************************
 * 5个常见的RuntimeException：
 * 	1> NullPointerException
 * 		当应用程序试图在需要对象的地方使用 null 时，抛出该异常	
 * 	2> ArrayIndexOutOfBoundsException
 * 		当使用的数组下标超出数组允许范围时，抛出该异常
 * 	3> ClassCastException
 * 		当试图将对象强制转换为不是实例的子类时，抛出该异常
 * 	4> NumberFormatException
 * 		当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常。
 * 	5> IllegalArgumentException
 * 		抛出的异常表明向方法传递了一个不合法或不正确的参数
 * 
 */
/**
 * @author wetts
 * @created 2015/06/06
 *
 */
package com.wetts._api.throwable;

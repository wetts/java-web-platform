/**
 * 最好用valueOf来实例化对象。
 *
 *********************************************
 * BigDecimal
 * 	需要用字符串转换，才能进行大数据运算
 * 	如果用基础类型转换，则不能进行大数据运算，跟普通运算效果相同
 * 
 *********************************************
 * DecimalFormat
 * 	符号的含义：
 * 		0 一个数字
 * 		# 一个数字，不包括0
 * 		. 小数的分隔符的占位符
 * 		, 分组分隔符的占位符
 * 		; 分隔格式
 * 		- 缺省负数前缀
 * 		% 乘以 100 和作为百分比显示
 * 		? 乘以 1000 和作为千进制货币符显示；用货币符号代替。如果双写，用国际货币符号代替。如果出现在一个模式中，用货币十进制分隔符代替十进制分隔符 
 * 		X 前缀或后缀中使用的任何其它字符，用来引用前缀或后缀中的特殊字符
 * 
 */
/**
 * @author wetts
 * @created 2015/06/06
 *
 */
package com.wetts._api.number;
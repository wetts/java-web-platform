/**
 * 计算机不同输出的随机数不同，但是有一点是相同的：在同一台机器上，甭管运行多少次，所打印的随机数都是相同的，也就是说第一次运行和第二次运行，打印出的随机数顺序永远相同
 * 那是因为产生随机数的种子固定了，在Java中，随机数的产生取决于种子，随机数和种子之间的关系遵从以下两个规则：
 * 		种子不同，产生不同的随机数
 * 		种子相同，即使实例不同也产生相同的随机数
 * 默认种子是System.nanoTime()的返回值（JDK1.5版本以前默认种子是System.currentTimeMilles()的返回值）
 */
/**
 * @author wetts
 * @created 2015/06/22
 *
 */
package com.wetts._api.util.random;
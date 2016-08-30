/**
 * 基本解析XML文件一般有两种方式：
 * DOM(Document Object Model)
 * 是基于XML文档树结构的解析
 * SAX(Simple API for XML)
 * 是基于事件流的解析
 * <p>
 * ***************************************************************************************
 * 还有两种比较好的框架：
 * DOM4J
 * DOM4J 是一个非常非常优秀的Java XML API，具有性能优异、功能强大和极端易用使用的特点，同时它也是一个开放源代码的软件。
 * 如今你可以看到越来越多的 Java 软件都在使用 DOM4J 来读写 XML，特别值得一提的是连 Sun 的 JAXM 也在用 DOM4J。
 * JDOM
 * 为减少DOM、SAX的编码量，出现了JDOM；优点：20-80原则，极大减少了代码量。
 * 使用场合：要实现的功能简单，如解析、创建等，但在底层，JDOM还是使用SAX（最常用）、DOM、Xanan文档。
 *
 * @author wetts
 * @created 2015/06/03
 */
package com.wetts.parseXML;
package com.wetts.parseXML.dom4j;

import com.wetts.parseXML.XmlDocument;

public class Client {

	public static void main(String[] args) {
		XmlDocument xmlDocument = new Dom4jDemo();
		xmlDocument.createXml("e://11.xml");
//		xmlDocument.parserXml("e://11.xml");
	}
}

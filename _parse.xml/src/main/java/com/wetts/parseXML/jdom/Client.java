package com.wetts.parseXML.jdom;

import com.wetts.parseXML.XmlDocument;

public class Client {

	public static void main(String[] args) {
		XmlDocument xmlDocument = new JDomDemo();
		xmlDocument.createXml("e://11.xml");
//		xmlDocument.parserXml("e://11.xml");
	}
}

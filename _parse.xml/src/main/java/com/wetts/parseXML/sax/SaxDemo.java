package com.wetts.parseXML.sax;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import com.wetts.parseXML.XmlDocument;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;

public class SaxDemo implements XmlDocument {

    public void createXml(String fileName) {
        // 创建SAX转换工厂
        SAXTransformerFactory sff = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
        // 转换处理器，侦听 SAX ContentHandler
        // 解析事件，并将它们转换为结果树 Result
        TransformerHandler th;
        try {
            th = sff.newTransformerHandler();
            Transformer transformer = th.getTransformer();
            // 设置字符编码
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            // 是否缩进
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            File file = new File(fileName);
            // 判断是否存在
            if (!file.exists()) {
                // 创建文件名
                file.createNewFile();
                FileOutputStream out = new FileOutputStream(file);
                // 构建转换结果树所需的信息
                Result resultStr = new StreamResult(out);
                // setResult() 必须在 startDocument() 之前调用
                th.setResult(resultStr);
                th.startDocument();
            }
            // 行结点属性
            AttributesImpl attr = new AttributesImpl();
            // 创建根元素<cities>,并设置其属性为空
            th.startElement("", "", "cities", attr);
            th.startElement("", "", "calsses", attr);
            // 创建一级子元素<group>,并设置其属性
            attr.clear();
            attr.addAttribute("", "name", "name", "", "张三");
            attr.addAttribute("", "num", "num", "", "10");
            th.startElement("", "", "group", attr);
            // 创建二级子元素<person>,并设置其属性
            attr.clear();
            attr.addAttribute("", "name", "name", "", "小明");
            attr.addAttribute("", "age", "age", "", "7");
            // 接受元素的开始
            th.startElement("", "", "person", attr);
            // 创建三级子元素<chinese>,并设置其值
            attr.clear();
            th.startElement("", "", "chinese", attr);
            th.characters("语文90".toCharArray(), 0, "语文90".length());
            th.endElement("", "", "chinese");
            // 创建四级子元素<english>,并设置其值
            th.startElement("", "", "english", attr);
            th.characters("英语80".toCharArray(), 0, "数学80".length());
            // 接收元素结束的通知
            th.endElement("", "", "english");
            th.endElement("", "", "person");
            th.endElement("", "", "group");
            th.endElement("", "calsses", "calsses");
            // 接收文档的结尾的通知
            th.endDocument();
            System.out.println(file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void parserXml(String fileName) {
        SAXParserFactory saxfac = SAXParserFactory.newInstance();
        try {
            SAXParser saxparser = saxfac.newSAXParser();
            InputStream is = new FileInputStream(fileName);
            saxparser.parse(is, new MySAXHandler());
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class MySAXHandler extends DefaultHandler {

    boolean hasAttribute = false;

    Attributes attributes = null;

    public void startDocument() throws SAXException {
        System.out.println("文档开始打印了");
    }

    public void endDocument() throws SAXException {
        System.out.println("文档打印结束了");
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("employees")) {
            return;
        }
        if (qName.equals("employee")) {
            System.out.println(qName);
        }
        if (attributes.getLength() > 0) {
            this.attributes = attributes;
            this.hasAttribute = true;
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (hasAttribute && (attributes != null)) {
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.println(attributes.getQName(0) + attributes.getValue(0));
            }
        }
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println(new String(ch, start, length));
    }

}

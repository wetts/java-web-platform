package com.wetts.parseXML.jdom;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import com.wetts.parseXML.XmlDocument;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

/**
 * @author hongliang.dinghl JDOM 生成与解析XML文档
 */
public class JDomDemo implements XmlDocument {

    public void createXml(String fileName) {
        Document document;
        Element root;
        root = new Element("employees");
        document = new Document(root);
        Element employee = new Element("employee");
        root.addContent(employee);
        Element name = new Element("name");
        name.setText("ddvip");
        employee.addContent(name);
        Element sex = new Element("sex");
        sex.setText("m");
        employee.addContent(sex);
        Element age = new Element("age");
        age.setText("23");
        employee.addContent(age);
        XMLOutputter XMLOut = new XMLOutputter();
        try {
            XMLOut.output(document, new FileOutputStream(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("rawtypes")
    public void parserXml(String fileName) {
        SAXBuilder builder = new SAXBuilder(false);
        try {
            Document document = builder.build(fileName);
            Element employees = document.getRootElement();
            List employeeList = employees.getChildren("employee");
            for (int i = 0; i < employeeList.size(); i++) {
                Element employee = (Element) employeeList.get(i);
                List employeeInfo = employee.getChildren();
                for (int j = 0; j < employeeInfo.size(); j++) {
                    System.out.println(((Element) employeeInfo.get(j)).getName() + ":" + ((Element) employeeInfo.get(j)).getValue());
                }
            }
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
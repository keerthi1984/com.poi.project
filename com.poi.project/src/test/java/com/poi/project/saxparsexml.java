package com.poi.project;

import java.io.File;
import java.util.List;

import javax.xml.parsers.SAXParserFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.w3c.dom.NodeList;

public class saxparsexml {

	public static void main(String[] args) throws DocumentException, XPathExpressionException {
		File f = new File("C:\\Users\\k.lakshmi.sheela\\Desktop\\parsingxml.xml");
		SAXReader reader = new SAXReader();
		Document Doc = reader.read(f);
		XPath xPath =  XPathFactory.newInstance().newXPath();
		//List<Node> nodes = Doc.selectNodes("//food/name");
		NodeList nodes = (NodeList) xPath.compile("//food/name").evaluate(
				Doc, XPathConstants.NODESET);
		System.out.println("Elements : " +nodes);
		int length = nodes.getLength();
		
		System.out.println("Length : " +length);
		for (int i=0; i<=length; i++)
		{
			Node name = (Node) nodes.item(i);
			System.out.println("\nCurrent Element :" + name.getName());
		}
		
		
		
		
	}

}

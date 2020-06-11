package com.poi.project;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class xmlDOMParser {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		
		File inputfile = new File("C:\\Users\\k.lakshmi.sheela\\Desktop\\parsingxml.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputfile);
        doc.getDocumentElement().normalize();
        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
        NodeList nList = doc.getElementsByTagName("food");
        System.out.println("food element :" + nList.getLength());
        for (int i=0; i<= nList.getLength(); i++)
        {
        	Node p = nList.item(i);
        	System.out.println(Node.ELEMENT_NODE);
        	System.out.println(p.getNodeType());
			if(p.getNodeType()==Node.ELEMENT_NODE)
			{ 
				Element name = (Element) p;
				//String name1 = name.getChildNodes();
				//System.out.println(name1);
				
			}
			
			 
        	
        }
	}

}

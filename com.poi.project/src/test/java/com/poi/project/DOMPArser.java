package com.poi.project;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

import org.w3c.dom.*;
import org.w3c.dom.Element;

public class DOMPArser {

	public static void main(String[] args) throws ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {
		DocumentBuilderFactory f= DocumentBuilderFactory.newInstance();
		DocumentBuilder b = f.newDocumentBuilder();
		Document doc = b.newDocument();
		
		Element rootelmnt = doc.createElement("LivingThings");
		Element plantelemnt = doc.createElement("Plants");
		Element Fruitelemnt = doc.createElement("Fruits");
		Element nameelemnt = doc.createElement("NameOfFruit");
		Element colourelemnt = doc.createElement("ColourOfFruit");
		Element taseteelemnt = doc.createElement("TasteOfFruit");
		
		Text t1 = doc.createTextNode("Apple");
		Text t2 = doc.createTextNode("Red");
		Text t3 = doc.createTextNode("Sweet");
		
		nameelemnt.appendChild(t1);
		colourelemnt.appendChild(t2);
		taseteelemnt.appendChild(t3);
		
		Fruitelemnt.appendChild(nameelemnt);
		Fruitelemnt.appendChild(colourelemnt);
		Fruitelemnt.appendChild(taseteelemnt);
		
		rootelmnt.appendChild(plantelemnt);
		plantelemnt.appendChild(Fruitelemnt);
		doc.appendChild(rootelmnt);
		
		Transformer t = TransformerFactory.newInstance().newTransformer();
		t.transform(new DOMSource(doc), new StreamResult ("C:\\Users\\k.lakshmi.sheela\\Desktop\\createxml.xml"));
		System.out.println("XML generated sucessfully");

	}

}

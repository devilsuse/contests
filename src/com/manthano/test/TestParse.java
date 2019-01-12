package com.manthano.test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author Dell
 */
public class TestParse
{
	public static void main(String[] args)
	{
		parseExamView("C:\\Users\\Dell\\Downloads\\Compressed\\examview_xml\\examview_xml.xml");
	}

	private static void parseExamView(String xmlFile)
	{
		try
		{
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();

			NodeList nodes = doc.getElementsByTagName("question-bank");

			for (int i = 0; i < nodes.getLength(); i++)
			{
				Node node = nodes.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE)
				{
					Element element = (Element) node;
					NamedNodeMap value = element.getAttributes();
					if (value != null)
					{
						String content = value.getNamedItem("bank-id").getNodeValue();
						System.out.println(content);
						String text = getStringValue(element);
						System.out.println(text.replace("<question-bank bank-id=\"" + content + "\">", "").replace(
								"</question-bank>", ""));
					}
				}
			}

			nodes = doc.getElementsByTagName("instruction");

			for (int i = 0; i < nodes.getLength(); i++)
			{
				Node node = nodes.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE)
				{
					Element element = (Element) node;
					NamedNodeMap value = element.getAttributes();
					if (value != null)
					{
						String content = value.getNamedItem("type").getNodeValue();
						System.out.println(content);
						String text = getStringValue(element);
						System.out.println(text.replace("<instruction type=\"" + content + "\">", "").replace(
								"</instruction>", ""));
					}
				}
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			nodes = doc.getElementsByTagName("question");

			for (int i = 0; i < nodes.getLength(); i++)
			{
				Node node = nodes.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE)
				{
					Element element = (Element) node;

					NamedNodeMap value = element.getAttributes();
					if (value != null)
					{
						System.out.println(value.getNamedItem("type").getNodeValue());
						System.out.println(value.getNamedItem("question-id").getNodeValue());
						System.out.println(value.getNamedItem("bank-id").getNodeValue());
						Node attribute = value.getNamedItem("narrative");
						if (attribute != null)
						{
							System.out.println(attribute.getNodeValue());
						}
					}

					String text = getStringValue(element.getElementsByTagName("text").item(0));
					System.out.println(text.replace("<text>", "").replace("</text>", ""));
					System.out.println(getValue("answer", element));
					System.out.println(getValue("points", element));
					String attributeValue = getFirstAttributeValue("choices", "columns", element);
					if (attributeValue != null)
					{
						System.out.println(attributeValue);
					}
					String choice = getStringValue(element.getElementsByTagName("choice-a").item(0));
					System.out.println(choice.replace("<choice-a>", "").replace("</choice-a>", ""));
					choice = getStringValue(element.getElementsByTagName("choice-b").item(0));
					System.out.println(choice.replace("<choice-b>", "").replace("</choice-b>", ""));
					choice = getStringValue(element.getElementsByTagName("choice-c").item(0));
					System.out.println(choice.replace("<choice-c>", "").replace("</choice-c>", ""));
					choice = getStringValue(element.getElementsByTagName("choice-d").item(0));
					System.out.println(choice.replace("<choice-d>", "").replace("</choice-d>", ""));

					System.out.println(getValue("points", element));
					attributeValue = getFirstAttributeValue("points", "scoring-method", element);
					if (attributeValue != null)
					{
						System.out.println(attributeValue);
					}
					System.out.println(getValue("answer-space", element));

					attributeValue = getFirstAttributeValue("response-grid", "type", element);
					if (attributeValue != null)
					{
						System.out.println(attributeValue);
					}
					System.out.println(getValue("grid-answer-boxes", element));
				}
				System.out.println("=================================================================");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static String getValue(String tag, Element element)
	{
		Node node = element.getElementsByTagName(tag).item(0);
		if (node != null)
		{
			NodeList nodes = node.getChildNodes();
			Node itemNode = (Node) nodes.item(0);
			return itemNode.getNodeValue();
		}
		return null;
	}

	private static String getFirstAttributeValue(String tag, String attribute, Element element)
	{
		NodeList nodeList = element.getElementsByTagName(tag);
		if (nodeList.item(0) != null)
		{
			Node value = nodeList.item(0).getAttributes().getNamedItem(attribute);
			if (value != null)
			{
				return value.getNodeValue();
			}
		}
		return null;
	}

	private static String getStringValue(Node node) throws Exception
	{
		DOMSource domSource = new DOMSource(node);
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
		// transformer.setOutputProperty(OutputKeys.METHOD, "xml");
		// transformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
		// transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount",
		// "4");
		transformer.setOutputProperty(OutputKeys.INDENT, "no");
		java.io.StringWriter sw = new java.io.StringWriter();
		StreamResult sr = new StreamResult(sw);
		transformer.transform(domSource, sr);
		String xml = sw.toString();
		return xml;
	}
}

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParsing {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
	DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=factory.newDocumentBuilder();
	Document doc=builder.parse("D:\\eclipse-workspace\\Practice\\Employee.xml");
	NodeList list=doc.getElementsByTagName("employee");
	for(int i=0;i<list.getLength();i++)
	{
		Node p=list.item(i);
		System.out.println(p.getNodeType());
		System.out.println(Node.ELEMENT_NODE);
		if(p.getNodeType()==Node.ELEMENT_NODE)
		{
			Element employee=(Element) p;
			NodeList details_of_employee=employee.getChildNodes();
			for(int j=0;j<details_of_employee.getLength();j++)
			{
			Node n=details_of_employee.item(j);
			if(n.getNodeType()==Node.ELEMENT_NODE)
			{
				Element id=(Element) n;
				System.out.println("The employee sequence is" +i+ "and details are" + " "+id.getTagName()+""+id.getTextContent());
				
			}
			}
		}
	}
	
	
	
	
	}

}

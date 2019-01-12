package com.nano.core.net;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * @author LXMRX
 */
public class URLGrabberTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		/*
		 * for (int i = 0; i < args.length; i++) {
		 */
		try
		{
			String doc = URLGrabber.getDocumentAsString("http://www.slashdot.org/slashdot.xml");
			System.out.println(doc);
		}
		catch (MalformedURLException e)
		{
			System.err.println("Malformed - " + e.getMessage());
			e.printStackTrace();
		}
		catch (IOException e)
		{
			System.err.println("IOException - " + e.getMessage());
			e.printStackTrace();
		}
	}

	// }

}

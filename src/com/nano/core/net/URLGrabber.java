package com.nano.core.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author LXMRX
 */
public class URLGrabber
{

	/**
	 * @param url
	 * @return InputStream
	 * @throws IOException
	 */
	public static InputStream getDocumentAsInputStream(URL url) throws IOException
	{

		InputStream in = url.openStream();
		return in;

	}

	/**
	 * @param url
	 * @return InputStream
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public static InputStream getDocumentAsInputStream(String url) throws MalformedURLException, IOException
	{

		URL u = new URL(url);
		return getDocumentAsInputStream(u);

	}

	/**
	 * @param url
	 * @return String
	 * @throws IOException
	 */
	public static String getDocumentAsString(URL url) throws IOException
	{

		StringBuffer result = new StringBuffer();
		InputStream in = url.openStream();
		int c;
		while ((c = in.read()) != -1)
			result.append((char) c);
		return result.toString();

	}

	/**
	 * @param url
	 * @return String
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public static String getDocumentAsString(String url) throws MalformedURLException, IOException
	{

		URL u = new URL(url);
		return getDocumentAsString(u);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// URL google = new URL("www.google.com");
		try
		{
			System.out.println(getDocumentAsString("https://www.google.co.in/"));
		}
		catch (MalformedURLException e)
		{
			System.out.println("MalformedURL");
			e.printStackTrace();
		}
		catch (IOException e)
		{
			System.out.println("IOException");
			e.printStackTrace();
		}
	}

}

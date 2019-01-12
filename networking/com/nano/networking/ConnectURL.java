package com.nano.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

/**
 * @author LXMRX
 */
public class ConnectURL
{

	private static final String	Username	= "AOL\\45000.sap";
	private static final String	Password	= "Initial2013#";

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String urlLink = "https://profitweb.afasonline.nl";
		// String urlLink = "http://www.google.com";
		URL url = null;
		try
		{
			url = new URL(urlLink);
		}
		catch (MalformedURLException e)
		{
			System.out.println("MalformedURLException............");
			e.printStackTrace();
			return;
		}
		catch (Exception ex)
		{
			System.out.println("Exception.........");
			ex.printStackTrace();
			return;
		}

		NtlmAuthenticator authenticator = new NtlmAuthenticator(Username, Password);
		Authenticator.setDefault(authenticator);

		System.out.println("url.getAuthority() - " + url.getAuthority());
		System.out.println("url.getPort() - " + url.getPort());
		System.out.println("url.getDefaultPort() - " + url.getDefaultPort());
		System.out.println("url.getFile() - " + url.getFile());
		System.out.println("url.getHost() - " + url.getHost());
		System.out.println("url.getPath() - " + url.getPath());
		System.out.println("url.getProtocol() - " + url.getProtocol());
		System.out.println("url.getQuery() - " + url.getQuery());
		System.out.println("url.getRef() - " + url.getRef());
		System.out.println("url.getUserInfo() - " + url.getUserInfo());
		System.out.println("url.toExternalForm() - " + url.toExternalForm());
		try
		{
			System.out.println("url.getContent() - " + url.getContent());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (Exception ex)
		{
			System.out.println("Exception in printing getContent().........");
			ex.printStackTrace();
		}

		URLConnection urlConnection = null;
		try
		{
			urlConnection = url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

			String inputLine = null;
			while ((inputLine = bufferedReader.readLine()) != null)
				System.out.println(inputLine);

			HttpsURLConnection httpsURLConnection = (HttpsURLConnection) urlConnection;
			System.out.println(httpsURLConnection.getResponseCode());
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}

	}
}

class NtlmAuthenticator extends Authenticator
{

	private final String	username;
	private final char[]	password;

	public NtlmAuthenticator(final String username, final String password)
	{
		super();
		this.username = new String(username);
		this.password = password.toCharArray();
	}

	@Override
	public PasswordAuthentication getPasswordAuthentication()
	{
		return (new PasswordAuthentication(username, password));
	}
}

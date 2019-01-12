package com.nano.networking;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 * @author LXMRX
 */
public class SystemNetworkProperties
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String username = System.getProperty("proxy.authentication.username");
		String password = System.getProperty("proxy.authentication.password");

		System.out.println("username -> " + username);
		System.out.println("password -> " + password);
		System.out.println("http.proxyPassword--> " + System.getProperty("http.proxyPassword"));
		System.out.println("https.proxyPassword--> " + System.getProperty("https.proxyPassword"));

		if (username != null && !username.equals(""))
		{
			Authenticator.setDefault(new ProxyAuthenticator(username, password));
		}

	}
}

class ProxyAuthenticator extends Authenticator
{

	private String	userName, password;

	protected PasswordAuthentication getPasswordAuthentication()
	{
		return new PasswordAuthentication(userName, password.toCharArray());
	}

	public ProxyAuthenticator(String userName, String password)
	{
		this.userName = userName;
		this.password = password;
	}
}

package com.nano.security;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.util.Enumeration;

public class ReadKeyStoreDetails
{

	/**
	 * @param args
	 * @throws UnrecoverableKeyException
	 */
	public static void main(String[] args) // throws UnrecoverableKeyException
	{
		FileInputStream is = null;
		try
		{

			File file = new File("C:\\Program Files\\Java\\jdk1.7.0_67\\jre\\lib\\security\\cacerts");
			is = new FileInputStream(file);
			KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
			String password = "changeit";
			keystore.load(is, password.toCharArray());

			Enumeration enumeration = keystore.aliases();
			while (enumeration.hasMoreElements())
			{
				String alias = (String) enumeration.nextElement();
				System.out.println("alias name: " + alias);
				Certificate certificate = keystore.getCertificate(alias);
				System.out.println(certificate.toString());

				/*
				 * Key key = keystore.getKey(alias, password.toCharArray());
				 * String encodedKey = new
				 * BASE64Encoder().encode(key.getEncoded());
				 * System.out.println("key ? " + encodedKey);
				 */

			}

		}

		catch (java.security.cert.CertificateException e)
		{
			e.printStackTrace();
		}
		catch (NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}

		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (KeyStoreException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (null != is)
				try
				{
					is.close();
				}
				catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}
}

package com.nano.file.parse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class DisplayHindiFont
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		PrintStream ps = null;
		// File file = new File("C:/Users/LXMRX/Desktop/UTF/Hindi UTF.txt");
		FileInputStream utfFileStream = null;
		try
		{
			utfFileStream = new FileInputStream(new File("C:/Users/LXMRX/Desktop/UTF/codes.txt"));
		}
		catch (FileNotFoundException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		BufferedReader in = new BufferedReader(new InputStreamReader(utfFileStream, Charset.forName("UTF-8")));

		StringBuffer sb = new StringBuffer();
		String line = "";

		try
		{
			while ((line = in.readLine()) != null)
				sb.append(line + "\r\n");
		}
		catch (IOException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// System.out.println(sb);

		String s = "가다 こんにちは";
		System.out.println(s);

		/*
		 * try
		 * {
		 * ps = new PrintStream(file, "UTF-8");
		 * }
		 * catch (FileNotFoundException e)
		 * {
		 * // TODO Auto-generated catch block
		 * e.printStackTrace();
		 * }
		 * catch (UnsupportedEncodingException e)
		 * {
		 * // TODO Auto-generated catch block
		 * e.printStackTrace();
		 * }
		 * System.setOut(ps);
		 * String str = "\u0905\u092d \u0940";
		 */
		// \u0938\u092e\u092f \u0939\u0948 \u091c\u0928\u0924\u093e \u091c\u094b
		// \u091a\u093e\u0939\u0924\u0940 \u0939\u0948 \u0992";
		// System.out.println(str);

	}
}

package com.nano.api;

public class CommonStringUtils
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String str1 = "abc";
		String str2 = null;
		System.out.println(equals1(str1, str2));

	}

	public static boolean equals1(String str1, String str2)
	{
		return ((str1 == null) ? false : (str2 == null) ? true : str1.equals(str2));
	}

}

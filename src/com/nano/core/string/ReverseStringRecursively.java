package com.nano.core.string;

public class ReverseStringRecursively
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String str = "abcdefghi";
		System.out.println(recursiveReverse(str));
	}

	static String recursiveReverse(String str)
	{
		if (str.length() < 2)
			return str;
		return recursiveReverse(str.substring(1)) + str.charAt(0);
	}
}

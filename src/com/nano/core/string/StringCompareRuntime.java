package com.nano.core.string;

public class StringCompareRuntime
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String test = "test";
		stringCompareRuntime(test, "test");
		compareContaenatedString();
		computeStringAtRuntime();
		compareSubString();
		compareSubStringIntern();
	}

	public static void stringCompareRuntime(String str1, String str2)
	{
		if (str1 == str2)
			System.out.println("Comparison successful...");
		else
			System.out.println("Comparison FAILED...");
	}

	public static void compareContaenatedString()
	{
		String str1 = "te" + "st";
		String str2 = "test";

		if (str1 == str2)
			System.out.println("concatenated compare SUCCESS...");
		else
			System.out.println("concatenated compare FAIL...");
	}

	public static void computeStringAtRuntime()
	{
		String s = "Hell";
		String str1 = s + "o";
		String str2 = "Hello";

		if (str1 == str2)
			System.out.println("Compute String at Runtime == compare SUCCESS...");
		else
			System.out.println("Compute String at Runtime == compare FAIL...");
	}

	public static void compareSubString()
	{
		String str = new String("test_test");
		String str1 = str.substring(0, 4);
		String str2 = "test";

		if (str1 == str2)
			System.out.println("SubString compare SUCCESS...");
		else
			System.out.println("SubString compare FAIL...");
	}

	public static void compareSubStringIntern()
	{
		String str = new String("test_test");
		String str1 = str.substring(0, 4).intern();
		String str2 = "test";

		if (str1 == str2)
			System.out.println("SubStringIntern compare SUCCESS...");
		else
			System.out.println("SubStringIntern compare FAIL...");
	}

}

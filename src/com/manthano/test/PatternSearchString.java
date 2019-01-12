package com.manthano.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternSearchString
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Pattern p = Pattern.compile("target");
		Matcher m = p.matcher("jlajlatargetkssk");
		System.out.println(m.find());

		String sourceString = "this_contains_the String";
		String toBeSearched = "contains";

		System.out.println(sourceString.contains(toBeSearched));
	}

}

package com.nano.core.string;

import java.util.Calendar;
import java.util.regex.Pattern;

public class StringReplaceRegexTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String str = "LANXESS Aktienplan {CurrentYear}.";

		int currentYear = Calendar.getInstance().get(Calendar.YEAR);

		System.out.println(currentYear);

		// str = str.replaceFirst("\\{currentYear\\}",
		// String.valueOf(currentYear));

		str = str.replaceFirst("\\{CurrentYear\\}", String.valueOf(currentYear));

		System.out.println(str);
	}
}

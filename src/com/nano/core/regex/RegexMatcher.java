package com.nano.core.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher
{
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	final String REGEX_PATTERN = "^(.+)@(.+)$"; // "^(.+)@(.+)$";
	Pattern pattern = Pattern.compile(REGEX_PATTERN);

	System.out.println("Enter String to be matched: ");
	String input = scanner.nextLine();
	Matcher matcher = pattern.matcher(input);

	System.out.println(matcher.matches());
	scanner.close();
    }
}

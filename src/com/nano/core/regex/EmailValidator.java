package com.nano.core.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator
{
    static private Pattern      pattern;
    static private Matcher      matcher;

    /**
     * Office Email Address ends with @LANXESS.COM And contains atleast one .
     * before @
     */
    private static final String OFFICE_EMAIL_PATTERN  = "^(.+)@LANXESS.COM$";

    /**
     * Private Email Address construct actually depends on the service
     * providers. Its difficult speculate the character set used in email. Form
     * example, private email service provider may allow below -
     * 
     * Latin Alphabet (with diacritics): Spelé@provider.com Umlauts, Japanese
     * characters.
     * 
     * In these cases, its better to develop separate methods for specific case.
     * 
     * So this pattern contains minimal check. Presence of @ and . after that.
     * And presence of at least one alphanumeric character before @.
     */
    private static final String PRIVATE_EMAIL_PATTERN = "^(.+)@(.+)$";

    public static boolean validate(String emailAddress, boolean isOfficeEmail)
    {
	if (isOfficeEmail)
	{
	    pattern = Pattern.compile(OFFICE_EMAIL_PATTERN,
		    Pattern.CASE_INSENSITIVE);
	}
	else
	    pattern = Pattern.compile(PRIVATE_EMAIL_PATTERN);

	matcher = pattern.matcher(emailAddress);
	return matcher.matches();
    }

    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	while (true)
	{
	    System.out.println("Enter email: ");
	    String email = scanner.nextLine();
	    // .readLine("Enter input string to search: "));
	    System.out.println(validate(email, false));
	}
    }
}
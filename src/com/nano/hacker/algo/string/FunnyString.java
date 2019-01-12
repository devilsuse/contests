package com.nano.hacker.algo.string;

import java.util.Scanner;

/**
 * 
 Problem Statement
 * 
 * Suppose you have a string S which has length N and is indexed from 0 to N−1.
 * String R is the reverse of the string S. The string S is funny if the
 * condition |Si−Si−1|=|Ri−Ri−1| is true for every i from 1 to N−1.
 * 
 * (Note: Given a string str, stri denotes the ascii value of the ith character
 * (0-indexed) of str. |x| denotes the absolute value of an integer x)
 * 
 * Input Format
 * 
 * First line of the input will contain an integer T. T testcases follow. Each
 * of the next T lines contains one string S.
 * 
 * Constraints
 * 
 * 1<=T<=10 2<=length of S<=10000
 * 
 * Output Format
 * 
 * For each string, print Funny or Not Funny in separate lines.
 * 
 * Sample Input
 * 
 * 2 acxz bcxz
 * 
 * Sample Output
 * 
 * Funny Not Funny
 * 
 * Explanation
 * 
 * Consider the 1st testcase acxz
 * 
 * here
 * 
 * |c-a| = |x-z| = 2 |x-c| = |c-x| = 21 |z-x| = |a-c| = 2
 * 
 * Hence Funny.
 * 
 * Consider the 2st testcase bcxz
 * 
 * here
 * 
 * |c-b| != |x-z|
 * 
 * Hence Not Funny.
 * 
 * @author LXMRX
 *
 */
public class FunnyString
{
    private static final String FUNNY     = "Funny";
    private static final String NOT_FUNNY = "Not Funny";

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int testCases = Integer.parseInt(in.nextLine());
	String strings[] = new String[testCases];

	for (int i = 0; i < testCases; i++)
	{
	    strings[i] = in.nextLine();
	}
	in.close();

	for (int i = 0; i < testCases; i++)
	{
	    funny(strings[i]);
	}
    }

    private static void funny(String str)
    {
	boolean isFunny = true;
	String reverse = new StringBuilder(str).reverse().toString();

	for (int i = 1; i < str.length(); i++)
	{
	    // casting to byte provides that characters ASCII value
	    if (Math.abs((byte) str.charAt(i) - (byte) str.charAt(i - 1)) == Math
		    .abs((byte) reverse.charAt(i)
			    - (byte) reverse.charAt(i - 1)))
		continue;
	    else
	    {
		isFunny = false;
		break;
	    }
	}
	if (isFunny)
	    System.out.println(FUNNY);
	else
	    System.out.println(NOT_FUNNY);
    }
}

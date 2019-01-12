package com.nano.hacker.algo.string;

import java.util.Scanner;

/**
 * 
 Problem Statement
 * 
 * You are given two strings, A and B. Find if there is a substring that appears
 * in both A and B.
 * 
 * Input Format
 * 
 * Several test cases will be given to you in a single file. The first line of
 * the input will contain a single integer T, the number of test cases.
 * 
 * Then there will be T descriptions of the test cases. Each description
 * contains two lines. The first line contains the string A and the second line
 * contains the string B.
 * 
 * Output Format
 * 
 * For each test case, display YES (in a newline), if there is a common
 * substring. Otherwise, display NO.
 * 
 * Constraints
 * 
 * All the strings contain only lowercase Latin letters. 1<=T<=10
 * 1<=|A|,|B|<=105
 * 
 * Sample Input
 * 
 * 2 hello world hi world
 * 
 * Sample Output
 * 
 * YES NO
 * 
 * Explanation
 * 
 * For the 1st test case, the letter o is common between both strings, hence the
 * answer YES. For the 2nd test case, hi and world do not have a common
 * substring, hence the answer NO.
 * 
 * @author LXMRX
 *
 */
public class TwoStrings
{
    private static final String YES = "YES";
    private static final String NO  = "NO";

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int testCases = Integer.parseInt(in.nextLine());
	String input1[] = new String[testCases];
	String input2[] = new String[testCases];

	for (int i = 0; i < testCases; i++)
	{
	    input1[i] = in.nextLine();
	    input2[i] = in.nextLine();
	    // displayResult(input1[i], input2[i]);
	    displayResultOptimized(input1[i], input2[i]);
	}
	in.close();
	/*
	 * for (int i = 0; i < testCases; i++) { displayResult(input1[i],
	 * input2[i]); }
	 */
    }

    private static void displayResultOptimized(String string1, String string2)
    {
	boolean[] containsChar = new boolean[26];
	for (char c : string1.toCharArray())
	{
	    int value = (int) c - 97;
	    containsChar[value] = true;
	}

	boolean containsCommonSubstring = false;
	for (char c : string2.toCharArray())
	{
	    int value = (int) c - 97;
	    if (containsChar[value])
	    {
		containsCommonSubstring = true;
		break;
	    }
	}

	if (containsCommonSubstring)
	    System.out.println(YES);
	else
	    System.out.println(NO);
    }

    // Below is the time-wise expensive solution.
    private static void displayResult(String string1, String string2)
    {
	// choosing smaller String for iterating through it.
	String smallerString = string1.length() <= string2.length() ? string1
		: string2;
	String biggerString = string1 == smallerString ? string2 : string1;

	boolean constains = false;

	// Concept - Even if single letter is common, substring exists.
	// So checking just one string.
	for (int i = 0; i < smallerString.length(); i++)
	{
	    if (biggerString.contains(String.valueOf(smallerString.charAt(i))))
	    {
		constains = true;
		break;
	    }
	}

	if (constains)
	    System.out.println(YES);
	else
	    System.out.println(NO);
    }
}

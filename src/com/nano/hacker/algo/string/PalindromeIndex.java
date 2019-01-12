package com.nano.hacker.algo.string;

import java.util.Scanner;

public class PalindromeIndex
{
    /**
     * Problem Statement
     * 
     * Russian
     * 
     * You are given a string of lowercase letters. Your task is to figure out
     * the index of the character on whose removal will make the string a
     * palindrome. There will always be a valid solution.
     * 
     * In case string is already palindrome, then -1 is also a valid answer
     * along with possible indices.
     * 
     * Input Format
     * 
     * The first line contains T i.e. number of test cases. T lines follow, each
     * line containing a string.
     * 
     * Output Format
     * 
     * Print the position ( 0 index ) of the letter by removing which the string
     * turns into a palindrome. For string, such as
     * 
     * bcbc we can remove b at index 0 or c at index 3. Both the answers are
     * accepted.
     * 
     * Constraints 1 ≤ T ≤ 20 1 ≤ length of string ≤ 100005 All characters are
     * latin lower case indexed.
     * 
     * Sample Input
     * 
     * 3 aaab baa aaa Sample Output
     * 
     * 3 0 -1 Explanation
     * 
     * In the given input, T = 3,
     * 
     * For input aaab, we can see that removing b from the string makes the
     * string a palindrome, hence the position 3. For input baa, removing b from
     * the string makes the string palindrome, hence the position 0. As the
     * string aaa is already a palindrome, you can output 0, 1 or 2 as removal
     * of any of the characters still maintains the palindrome property. Or you
     * can print -1 as this is already a palindrome.
     * 
     * @param args
     */
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	int totalTestCases = Integer.parseInt(scanner.nextLine());

	String testString = null;
	StringBuffer outputString = new StringBuffer();
	int length = 0;
	for (int i = 0; i < totalTestCases; i++)
	{
	    testString = scanner.nextLine();
	    length = testString.length();
	    if (isPalindrome(testString) || testString.length() == 1)
	    {
		outputString.append("-1");
	    }
	    else
	    {
		for (int j = 0; j < length / 2; j++)
		{
		    if (testString.charAt(j) != testString.charAt(length - 1
			    - j))
		    {
			if (testString.charAt(j + 1) == testString
				.charAt(length - 1 - j)
				&& isPalindrome(testString.substring(0, j)
					+ testString.substring(j + 1)))
			    outputString.append(j);
			else
			    // if (isPalindrome(testString.substring(0,
			    // testString.charAt(length - 1 - j))
			    // + testString.substring(length - j)))
			    outputString.append(length - 1 - j);
			break;
		    }
		}
	    }
	    outputString.append("\n");
	}
	System.out.println(outputString);
	scanner.close();
    }

    public static void main_My_Way(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	int totalTestCases = Integer.parseInt(scanner.nextLine());

	String testString = null;
	StringBuffer outputString = new StringBuffer();
	for (int i = 0; i < totalTestCases; i++)
	{
	    testString = scanner.nextLine();
	    // boolean is0thElementTrue = false;
	    // One lettered word is always a palindrome so checked that
	    // condition
	    if (isPalindrome(testString) || testString.length() == 1)
	    {
		outputString.append("-1");
	    }
	    else
	    {
		if (isPalindrome(testString.substring(1)))
		{
		    outputString.append("0 ");
		    continue;
		    // is0thElementTrue = true;
		}
		// See here j - index starts from 1 as initial case is
		// already
		// handled in above if-condition
		// Also see the condition checks [j < testString.length() -
		// 1;]
		// because (testString.length() - 1) is checked separately
		// after
		// this for loop.;
		// boolean isLoopSuccessAtleastOnce = false;
		for (int j = 1; j < testString.length() - 1; j++)
		{
		    if (isPalindrome(testString.substring(0, j)
			    + testString.substring(j + 1, testString.length())))
		    {
			/*
			 * isLoopSuccessAtleastOnce = true; if
			 * (is0thElementTrue) { outputString.append(j);
			 * is0thElementTrue = false; } else
			 * outputString.append(" " + j);
			 */
			outputString.append(j);
		    }
		}
		if (isPalindrome(testString.substring(0,
			testString.length() - 1)))
		{
		    /*
		     * if (isLoopSuccessAtleastOnce) outputString.append(" " +
		     * (testString.length() - 1)); else
		     */
		    outputString.append((testString.length() - 1));
		}
	    }
	    outputString.append("\n");
	}
	System.out.println(outputString.toString());
	scanner.close();
    }

    private static boolean isPalindrome(String str)
    {
	StringBuilder strBuilder = new StringBuilder(str);
	return str.equals(strBuilder.reverse().toString());
    }

    private static boolean isPalindrome_MyWay_Slow(String str)
    {
	int n = str.length();
	for (int i = 0; i < (n / 2) + 1; i++)
	{
	    if (str.charAt(i) != str.charAt(n - i - 1))
	    {
		return false;
	    }
	}

	return true;
	/*
	 * boolean isPalindrome = true; int midPoint = ((str.length() % 2) == 0)
	 * ? ((str.length()) / 2) : ((str .length() + 1) / 2); for (int i = 0; i
	 * < midPoint; i++) { if (str.charAt(i) == str.charAt(str.length() - 1 -
	 * i)) continue; else { isPalindrome = false; break; } } return
	 * isPalindrome;
	 */
    }
}

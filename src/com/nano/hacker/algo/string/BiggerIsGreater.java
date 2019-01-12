package com.nano.hacker.algo.string;

import java.util.Scanner;

/**
 * Problem Statement
 * 
 * Please note that this is a team event, and your submission will be accepted
 * only as a part of a team, even single member teams are allowed. Please click
 * here to register as a team, if you have NOT already registered.
 * 
 * Given a word w, rearrange the letters of w to construct another word s in
 * such a way that, s is lexicographically greater than w. In case of multiple
 * possible answers, find the lexicographically smallest one.
 * 
 * Input Format The first line of input contains t, number of test cases. Each
 * of the next t lines contains w.
 * 
 * Constraints 1≤t≤105 1≤|w|≤100 w will contain only lower case english letters
 * and its' length will not exceed 100.
 * 
 * Output Format For each testcase, output a string lexicographically bigger
 * than w in a separate line. In case of multiple possible answers, print the
 * lexicographically smallest one and if no answer exists, print no answer.
 * 
 * Sample Input
 * 
 * 3 ab bb hefg Sample Output
 * 
 * ba no answer hegf Explanation
 * 
 * Testcase 1 : There exists only one string greater than ab which can be built
 * by rearranging ab. That is ba. Testcase 2 : Not possible to re arrange bb and
 * get a lexicographically greater string. Testcase 3 : hegf is the next string
 * ( lexicographically greater ) to hefg.
 * 
 * @author LXMRX
 *
 */
public class BiggerIsGreater
{
    static String NOANSWER = "no answer";

    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	int totalTestCases = Integer.parseInt(scanner.nextLine());

	StringBuilder output = new StringBuilder();
	for (int i = 0; i < totalTestCases; i++)
	{
	    output.append(process(scanner.nextLine()) + "\n");
	}
	scanner.close();
	System.out.println(output);
    }

    private static String process(String word)
    {
	String biggerWord = NOANSWER;
	// byte matches = 0;
	// char c= 0;
	// using byte instead of int as max length of word is given as 100
	// i>0 has been used as for n things number of comparisons are (n-1)
	// only
	for (byte i = (byte) (word.length() - 1); i > 0; i--)
	{
	    if (word.charAt(i) > word.charAt(i - 1))
	    {
		// c= word.charAt(i);
		if (i != word.length() - 1)
		    biggerWord = word.substring(0, i - 1) + word.charAt(i)
			    + word.charAt(i - 1) + word.substring(i + 1);
		else
		    biggerWord = word.substring(0, i - 1) + word.charAt(i)
			    + word.charAt(i - 1);
		break;
	    }
	    // matches var will take of the fact that are all characters in the
	    // word same, if so the no answer is possible.
	    // This is checked here so that we don't have to make a looping
	    // again just to check if all char are same.
	    /*
	     * else if (word.charAt(i) == word.charAt(i - 1)) { matches++; }
	     */

	}
	/*
	 * if (biggerWord == null) { if (matches == (word.length() - 1))
	 * biggerWord = NOANSWER;
	 */
	/*
	 * else { for (byte i = (byte) (word.length() - 1); i > 0; i--) { if
	 * (word.charAt(i) != 'z') { if (i != word.length() - 1) biggerWord =
	 * word.substring(0, i) + String.valueOf(word.charAt(i) + 1) +
	 * word.substring(i + 1); else biggerWord = word.substring(0, i) +
	 * String.valueOf(word.charAt(i) + 1); } } if (biggerWord == null)
	 * biggerWord = NOANSWER; }
	 */
	// }
	return biggerWord;
    }
}

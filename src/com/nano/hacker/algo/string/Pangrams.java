package com.nano.hacker.algo.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Problem Statement
 * 
 * Roy wanted to increase his typing speed for programming contests. So, his
 * friend advised him to type the sentence
 * "The quick brown fox jumps over the lazy dog" repeatedly because it is a
 * pangram. ( pangrams are sentences constructed by using every letter of the
 * alphabet at least once. )
 * 
 * After typing the sentence several times, Roy became bored with it. So he
 * started to look for other pangrams.
 * 
 * Given a sentence s, tell Roy if it is a pangram or not.
 * 
 * Input Format
 * 
 * Input consists of a line containing s.
 * 
 * Constraints Length of s can be atmost 103 (1≤|s|≤103) and it may contain
 * spaces, lowercase and uppercase letters. Lowercase and uppercase instances of
 * a letter are considered same.
 * 
 * Output Format
 * 
 * Output a line containing pangram if s is a pangram, otherwise output not
 * pangram.
 * 
 * Sample Input #1
 * 
 * We promptly judged antique ivory buckles for the next prize Sample Output #1
 * 
 * pangram Sample Input #2
 * 
 * We promptly judged antique ivory buckles for the prize Sample Output #2
 * 
 * not pangram Explanation
 * 
 * In the first testcase, the answer is pangram because the sentence contains
 * all the letters.
 * 
 * @author LXMRX
 *
 */
public class Pangrams
{
    static Map<Character, Integer> characterToCountMap = new HashMap<>();
    static String		  NOTPANGRAM	  = "not pangram";
    static String		  PANGRAM	     = "pangram";
    static
    {
	for (char c = 'a'; c <= 'z'; c++)
	{
	    characterToCountMap.put(c, 0);
	}
    }

    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	String sentence = scanner.nextLine();
	char c;
	int matchedCharacterCount = 0;
	if (sentence.length() < 26)
	{
	    System.out.println(NOTPANGRAM);
	    scanner.close();
	    return;
	}

	// changing it lower case is important because in characterTpCountMap
	// only lower case characters has been inserted.
	sentence = sentence.toLowerCase();
	for (int i = 0; i < sentence.length(); i++)
	{
	    c = sentence.charAt(i);
	    // Below check on space is very imp other get() operation on
	    // characterToCountMap would return null and hence NPE.
	    // In the question it has been specifically mentioned that sentence
	    // may contain lower case, upper case alphabets and spaces.
	    // alphabets has already been inserted in map so that ok and space
	    // is checked with below condition. Also if other characters are
	    // there,
	    // they also need to be checked individually.
	    if (c == ' ')
		continue;
	    if (characterToCountMap.get(c) == 0)
	    {
		matchedCharacterCount++;
		characterToCountMap.put(c, 1);
	    }

	    if (matchedCharacterCount == 26)
		break;
	}
	if (matchedCharacterCount == 26)
	    System.out.println(PANGRAM);
	else
	    System.out.println(NOTPANGRAM);
	scanner.close();

    }

}

package com.nano.hacker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameOfThrones_I
{

	/**
	 * Problem Statement
	 * King Robert has 7 kingdoms under his rule. He finds out from a raven that
	 * the Dothraki are soon going to wage a war against him. But, he knows the
	 * Dothraki need to cross the Narrow River to enter his realm. There is only
	 * one bridge that connects both banks of the river which is sealed by a
	 * huge door.
	 * The king wants to lock the door so that the Dothraki can't enter. But, to
	 * lock the door he needs a key that is an anagram of a certain palindrome
	 * string.
	 * The king has a string composed of lowercase English letters. Help him
	 * figure out if any anagram of the string can be a palindrome or not.
	 * Input Format
	 * A single line which contains the input string
	 * Constraints
	 * 1<=length of string <= 10^5
	 * Each character of the string is a lowercase English letter.
	 * Output Format
	 * A single line which contains YES or NO in uppercase.
	 * Sample Input : 01
	 * aaabbbb
	 * Sample Output : 01
	 * YES
	 * Explanation
	 * A palindrome permutation of the given string is bbaaabb.
	 * Sample Input : 02
	 * cdefghmnopqrstuvw
	 * Sample Output : 02
	 * NO
	 * Explanation
	 * You can verify that the given string has no palindrome permutation.
	 * Sample Input : 03
	 * cdcdcdcdeeeef
	 * Sample Output : 03
	 * YES
	 * Explanation
	 * A palindrome permutation of the given string is ddcceefeeccdd .
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner myScan = new Scanner(System.in);
		String inputString = myScan.nextLine();

		// Assign ans a value of YES or NO, depending on whether or not
		// inputString satisfies the required condition
		if (canBeArrangedAsPalindrome(inputString))
			System.out.println("YES");
		else
			System.out.println("NO");
		myScan.close();

	}

	static boolean canBeArrangedAsPalindrome(String str)
	{
		Map<String, Integer> charToCountMap = new HashMap<>();
		String string = null;
		for (int i = 0; i < str.length(); i++)
		{
			string = String.valueOf(str.charAt(i));
			Integer count = charToCountMap.get(string);
			if (count == null)
				charToCountMap.put(string, 1);
			else
			{
				count++;
				charToCountMap.put(string, count);
			}
		}

		int count = 0;
		int oddCount = 0;
		for (String s : charToCountMap.keySet())
		{
			count = charToCountMap.get(s);
			if (isOdd(count))
				oddCount++;
			if (oddCount > 1)
				break;
		}
		if (oddCount > 1)
			return false;
		return true;
	}

	static boolean isOdd(int num)
	{
		return (num % 2 == 1);
	}
}

package com.nano.hacker.algo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LXMRX
 *         Sid is obsessed about reading short stories. Being a CS student, he
 *         is doing some interesting frequency analysis with the books. From two
 *         short story books, he choses strings having length a from the first
 *         and strings having length b from the second one. The strings are such
 *         that the difference of length is <= 1
 *         i.e.
 *         |a-b|<=1, where |x| represents the absolute value function.
 *         He believes that both the strings should be anagrams based on his
 *         experiment. Your challenge is to help him find the minimum number of
 *         characters of the first string he needs to change to make it an
 *         anagram of the second string. Neither can he add a character nor
 *         delete a character from the first string. Only replacement of the
 *         characters with new ones is allowed.
 *         Input Format
 *         First line will contain an integer T representing the number of test
 *         cases. Each test case will contain a string having length (a+b) which
 *         will be concatenation of both the strings described in problem. The
 *         string will only contain small letters and without any spaces.
 *         Output Format
 *         An integer corresponding to each test case is printed in a different
 *         line i.e., the number of changes required for each test case. Print
 *         ‘-1’ if it is not possible.
 *         Constraints
 *         1<=T<=100
 *         length of input string i.e. 1<=a+b<=10000
 *         Sample Input
 *         5
 *         aaabbb
 *         ab
 *         abc
 *         mnop
 *         xyyx
 *         Sample Output
 *         3
 *         1
 *         -1
 *         2
 *         0
 *         Explanation
 *         In fifth test case, first string will be “xy” while second string
 *         will be “yx” . so a = 2 and b = 2, where a and b are length of
 *         strings. As we can see that a and b are following relation
 *         |a-b|<=1
 *         and both strings are anagrams.So number of changes required = 0.
 *         10
 *         hhpddlnnsjfoyxpciioigvjqzfbpllssuj
 *         xulkowreuowzxgnhmiqekxhzistdocbnyozmnqthhpievvlj
 *         dnqaurlplofnrtmh
 *         aujteqimwfkjoqodgqaxbrkrwykpmuimqtgulojjwtukjiqrasqejbvfbixnchzsahpnyayutsgecwvcqngzoehrmeeqlgknnb
 *         lbafwuoawkxydlfcbjjtxpzpchzrvbtievqbpedlqbktorypcjkzzkodrpvosqzxmpad
 *         drngbjuuhmwqwxrinxccsqxkpwygwcdbtriwaesjsobrntzaqbe
 *         ubulzt
 *         vxxzsqjqsnibgydzlyynqcrayvwjurfsqfrivayopgrxewwruvemzy
 *         xtnipeqhxvafqaggqoanvwkmthtfirwhmjrbphlmeluvoa
 *         gqdvlchavotcykafyjzbbgmnlajiqlnwctrnvznspiwquxxsiwuldizqkkaawpyyisnftdzklwagv
 *         Expected Output
 *         10
 *         13
 *         5
 *         26
 *         15
 *         -1
 *         3
 *         13
 *         13
 *         -1
 */
public class Anagram
{

	private static BufferedReader	reader	= new BufferedReader(new InputStreamReader(System.in));

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		int testCases = Integer.parseInt(reader.readLine());
		for (int i = 0; i < testCases; i++)
			solve(reader.readLine());
	}

	private static void solve(String str)
	{
		int length = str.length();
		if (length % 2 != 0)
		{
			System.out.println("-1");
			return;
		}
		String firstStr = str.substring(0, length / 2);
		Map<Character, Integer> firstMap = fillMap(firstStr);

		String secondStr = str.substring(length / 2);
		Map<Character, Integer> secMap = fillMap(secondStr);

		int diffLength = 0;
		for (Character a : secMap.keySet())
		{
			Integer count1 = firstMap.get(a);
			Integer count2 = secMap.get(a);
			if (count1 == null)
			{
				diffLength += count2;
				continue;
			}
			if (count2 > count1)
				diffLength += count2 - count1;
		}
		System.out.println(diffLength);
	}

	private static Map<Character, Integer> fillMap(String str)
	{
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char c;
		for (int i = 0; i < str.length(); i++)
		{
			c = str.charAt(i);
			if (charMap.get(c) == null)
				charMap.put(c, 1);
			else
			{
				int count = charMap.get(c);
				count++;
				charMap.put(c, count);
			}
		}
		return charMap;
	}
}

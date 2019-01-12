package com.nano.inter;

import java.util.TreeMap;

public class FormLargestNumber
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] input = { 45, 60, 540, 87, 11 };
		String[] strArray = new String[input.length];
		int maxLengthOfNumber = 0;
		// char[] firstDigitCharArray = null;
		TreeMap<Character, Integer> firstCharMap = new TreeMap<Character, Integer>();
		for (int i = 0; i < input.length; i++)
		{
			strArray[i] = String.valueOf(input[i]);
			firstCharMap.put(strArray[i].charAt(0), input[i]);
			// firstDigitCharArray[i] = strArray[i].charAt(0);
			if (strArray[i].length() > maxLengthOfNumber)
				maxLengthOfNumber = strArray[i].length();
		}
		// Arrays.sort(firstDigitCharArray);
		for (Character c : firstCharMap.descendingKeySet())
			System.out.print(firstCharMap.get(c) + "");

	}

	public String[] sortByLexicalOrderInPosition(String[] strArray, int maxLengthOfNumber)
	{
		String[] temp = null;
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put(null, "s");
		for (int i = 0; i < strArray.length; i++)
		{

		}
		return temp;
	}
}

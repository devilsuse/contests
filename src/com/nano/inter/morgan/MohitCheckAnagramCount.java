package com.nano.inter.morgan;

import java.util.Arrays;

public class MohitCheckAnagramCount
{

	public static void main(String[] args)
	{

		/*
		 * Given two strings find the Rotation Distance between them. For a pair
		 * of strings which are rotations of each other, rotation distance is
		 * the MINIMUM distance between the respective elements of both the
		 * strings. If the strings are not rotations of each other, then return
		 * -1. Sample Testcases: Testcase 1 Input: str1 = “ABACD” str2 = “CDABA”
		 * Output: 2 Explanation: If we rotate each element of str1 to the RIGHT
		 * by 2, we obtain str2. ABACD --> DABAC --> CDABA Testcase 2 Input:
		 * str1 = “ABACD” str2 = “BACDA” Output: 1 Explanation: If we rotate
		 * each element of str1 to the LEFT by 1, we obtain str2. ABACD -->
		 * BACDA
		 */

		// String s1 = "ABACD";
		// String s2 = "AABCD";// -1
		// String s1 = "ABACD";
		// String s2 = "ABACD";// 0
		// String s1 = "ABACD";
		// String s2 = "BACDA";// 1
		String s1 = "ABACD";
		String s2 = "CDABA";// 3

		boolean flag = false;
		flag = checkAnagram(s1, s2);
		if (flag)
		{
			// System.out.println("Strings are anagrams of each others");
			findCount(s1, s2);
		}
		else
			System.out.println("Strings are not relevant to each others");

	}

	private static void findCount(String s1, String s2)
	{
		String s = s1 + s1;
		if (s.contains(s2))
		{
			int count = s.indexOf(s2);
			if (count == 0 && !s1.equals(s2))
				count++;
			System.out.print("#Rotations : " + count);
		}
		else
			System.out.print("#Rotations : -1");
	}

	private static boolean checkAnagram(String s1, String s2)
	{
		if (s1.length() != s2.length())
			return false;

		String c1 = arrangeLetters(s1);
		String c2 = arrangeLetters(s2);
		if (!c1.equalsIgnoreCase(c2))
			return false;

		return true;
	}

	private static String arrangeLetters(String s)
	{
		String n = "";
		char a[] = new char[s.length()];
		a = s.toCharArray();
		Arrays.sort(a);
		for (char l : a)
		{
			n = n + Character.toString(l);
		}
		return n;
	}

}

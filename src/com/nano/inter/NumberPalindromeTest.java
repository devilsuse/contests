package com.nano.inter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberPalindromeTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(reader.readLine());
		System.out.println(isPalindrome(number));
	}

	public static int reverse(int number)
	{
		int reverseNumber = 0;
		while (number != 0)
		{
			reverseNumber = reverseNumber * 10 + number % 10;
			number = number / 10;
		}
		return reverseNumber;
	}

	public static boolean isPalindrome(int number)
	{
		int reverse = reverse(number);
		if (number == reverse)
			return true;
		else
			return false;
	}

}

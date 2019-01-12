package com.nano.hacker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDigits
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int totalTestCases = Integer.parseInt(scanner.nextLine());

		String line = null;
		List<String> testNumberList = new ArrayList<>();
		for (int i = 0; i < totalTestCases; i++)
		{
			line = scanner.nextLine();
			testNumberList.add(line);
		}

		for (int i = 0; i < totalTestCases; i++)
			System.out.println(getNumberOfDivisors(testNumberList.get(i)));

		scanner.close();
	}

	static int getNumberOfDivisors(String str)
	{
		int count = 0;
		long num = Long.valueOf(str);
		int digit;
		for (int i = 0; i < str.length(); i++)
		{
			digit = Integer.parseInt(String.valueOf(str.charAt(i)));
			if (digit == 0)
				continue;
			if (digit == 1)
			{
				count++;
				continue;
			}
			if (num % digit == 0)
				count++;
		}
		return count;
	}

}

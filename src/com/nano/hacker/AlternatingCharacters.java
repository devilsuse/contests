package com.nano.hacker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author LXMRX
 */
public class AlternatingCharacters
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
			System.out.println(getMininumDeletions(testNumberList.get(i)));

		scanner.close();
	}

	static int getMininumDeletions(String str)
	{
		int deletionCount = 0;
		char previous = str.charAt(0);
		// Note: i startes from 1 as 0 is already stored above and its basis of
		// comparision.
		for (int i = 1; i < str.length(); i++)
		{
			if (str.charAt(i) == previous)
				deletionCount++;
			else
				previous = str.charAt(i);
		}
		return deletionCount;
	}

}

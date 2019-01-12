package com.nano.hacker;

import java.util.Scanner;

public class q
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		// int res;

		int K = Integer.parseInt(in.nextLine());
		String str = in.nextLine();

		int strLength = str.length();

		int possBlock = strLength / K;
		char[] cArray = str.toCharArray();

		String[] arr = null;
		int thePass = 0;
		for (int i = 0; i < possBlock; i++)
		{
			int firstIndex = i * K;

			if (firstIndex == 0)
			{}
			else
				firstIndex--;

			char temp = cArray[firstIndex];
			cArray[firstIndex] = cArray[((firstIndex * K) - 1) < 0 ? K - 1 : (firstIndex * K) - 1];
			cArray[((firstIndex * K) - 1) < 0 ? K - 1 : (firstIndex * K) - 1] = temp;
			thePass++;
		}

		String newStr = new String(cArray);
		System.out.println(newStr);

	}
}

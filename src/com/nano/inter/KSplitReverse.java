package com.nano.inter;

import java.io.IOException;

/**
 * @author LXMRX
 */
public class KSplitReverse
{

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		String str = "abcdefghijk";
		int k = 10;
		int sizeOfStringArray = str.length() / k;
		String array[] = new String[sizeOfStringArray];
		int start = 0;
		int end = start + k;
		for (int i = 0; i < sizeOfStringArray; i++)
		{
			array[i] = str.substring(start, end);
			start = start + k;
			if ((end + k) > str.length())
			{
				end = sizeOfStringArray;
			}
			else
			{
				end = end + k;
			}
		}
		for (String a : array)
		{
			String x = new StringBuilder(a).reverse().toString();
			System.out.print(x + " ");
		}
		if (str.length() > (sizeOfStringArray * k))
		{
			String remainingString = str.substring(sizeOfStringArray * k);
			System.out.print(remainingString);
		}
	}
}

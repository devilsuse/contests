package com.nano.hacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LXMRX
 */
public class InsertionSortPart1
{

	static BufferedReader	reader	= new BufferedReader(new InputStreamReader(System.in));

	/**
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException
	{

		int length = Integer.parseInt(reader.readLine());
		int[] arr = new int[length];
		String arrayLine = reader.readLine();
		String[] splitArray = arrayLine.split(" ");

		for (int i = 0; i < length; i++)
			arr[i] = Integer.parseInt(splitArray[i]);

		int v = arr[length - 1];
		for (int i = length - 2; i >= 0; i--)
		{
			if (arr[i] > v)
			{
				arr[i + 1] = arr[i];
				if (i == 0)
					arr[i] = v;

				printArray(arr);
			}// avoiding printing array when arr[i]==v
			else if (arr[i] < v)
			{
				arr[i + 1] = v;
				printArray(arr);
				break;
			}
			System.out.println();
		}

	}

	private static void printArray(int[] arr)
	{
		for (int j = 0; j < arr.length; j++)
		{
			System.out.print(arr[j]);
			if (j != arr.length - 1)
				System.out.print(" ");
		}
	}

}

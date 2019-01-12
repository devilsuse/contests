package com.nano.hacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author LXMRX Animesh has N empty candy jars numbered from 1 to N with
 *         infinite capacity. He performs M operations. Each operation is
 *         described by 3 integers a, b and k where a and b are index of the
 *         jars and k is the number of candies to be added inside each jar with
 *         index between a and b (both inclusive). Can you tell the average
 *         number of candies after M operations? Input Format The first line
 *         contains two integers N and M separated by a single space. M lines
 *         follow. Each of the M lines contain three integers a, b and k
 *         separated by single space. Output Format A single line containing the
 *         average number of candies across N jars, rounded down to the nearest
 *         integer. Note Rounded down means finding the greatest integer which
 *         is less than or equal to given number. Eg, 13.65 and 13.23 is rounded
 *         down to 13 while 12.98 is rounded down to 12. Constraints 3 <= N <=
 *         107 1 <= M <= 105 1 <= a <= b <= N 0 <= k <= 106 Sample Input #00 5 3
 *         1 2 100 2 5 100 3 4 100 Sample Output #00 160 Explanation Initially
 *         each of the jar contains 0 candies 0 0 0 0 0 First operation 100 100
 *         0 0 0 Second operation 100 200 100 100 100 Third operation 100 200
 *         200 200 100 Total = 800, Average = 800/5 = 160
 */
public class FillingJars
{

	static BufferedReader	reader	= new BufferedReader(new InputStreamReader(System.in));

	/**
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		String firstLine = reader.readLine();
		String[] firstLineSplitArray = firstLine.split(" ");
		// int numJars = Integer.parseInt(firstLineSplitArray[0]);
		String numJars = firstLineSplitArray[0];
		int numOperations = Integer.parseInt(firstLineSplitArray[1]);

		/*
		 * int[] startIndex = new int[numOperations]; int[] endIndex = new
		 * int[numOperations]; int[] numCandies = new int[numOperations];
		 */

		String[] startIndex = new String[numOperations];
		String[] endIndex = new String[numOperations];
		String[] numCandies = new String[numOperations];

		for (int i = 0; i < numOperations; i++)
		{
			String nextLine = reader.readLine();
			String[] nextLineSplitArray = nextLine.split(" ");
			startIndex[i] = nextLineSplitArray[0];
			endIndex[i] = nextLineSplitArray[1];
			numCandies[i] = nextLineSplitArray[2];
		}

		BigInteger totalCandies = BigInteger.ZERO;
		BigInteger temp = BigInteger.ZERO;
		for (int i = 0; i < numOperations; i++)
		{
			temp = new BigInteger(endIndex[i]).subtract(new BigInteger(startIndex[i])).add(BigInteger.ONE);
			temp = temp.multiply(new BigInteger(numCandies[i]));
			totalCandies = totalCandies.add(temp);
			// totalCandies += numCandies[i] * (endIndex[i] - startIndex[i] +
			// 1);
		}

		System.out.println(totalCandies.divide(new BigInteger(numJars)));
		// System.out.println(totalCandies / numJars);
	}

}

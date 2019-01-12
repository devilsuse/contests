package com.nano.hacker;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author LXMRX Alex is attending a Halloween party with his girlfriend Silvia.
 *         At the party, Silvia spots a giant chocolate bar. If the chocolate
 *         can be served as only 1 x 1 sized pieces and Alex can cut the
 *         chocolate bar exactly K times, what is the maximum number of
 *         chocolate pieces Alex can cut and give Silvia? Input Format The first
 *         line contains an integer T denoting the number of testcases. T lines
 *         follow. Each line contains an integer K Output Format T lines. Each
 *         containing the output corresponding to the testcase. Constraints
 *         1<=T<=10 2<=K<=107 Note Chocolate needed to be served in size of 1 x
 *         1 size pieces. Alex can�t relocate any of the pieces. Neither he can
 *         place any piece on top of other. Sample Input #00 4 5 6 7 8 Sample
 *         Output #00 6 9 12 16 Explanation The explanation below is for the
 *         first two test-cases. The rest of them follow a similar logic. For
 *         the first test-case where K = 5,You need 3 Horizontal and 2 vertical
 *         cuts.For the second test-case where K = 6,You need 3 Horizontal and 3
 *         vertical cuts.
 */
public class HalloweenParty
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int testCases = Integer.parseInt(scanner.nextLine());

		BigInteger[] numberOfCuts = new BigInteger[testCases];
		for (int i = 0; i < testCases; i++)
		{
			numberOfCuts[i] = new BigInteger(scanner.nextLine());
		}

		for (int i = 0; i < testCases; i++)
		{
			getMaximumNumberChocolate(numberOfCuts[i]);
		}
	}

	/**
	 * @param numberOfCuts
	 */
	public static void getMaximumNumberChocolate(BigInteger numberOfCuts)
	{
		BigInteger two = new BigInteger("2");
		BigInteger divideByTwoQuotient = numberOfCuts.divide(two);

		if (numberOfCuts.remainder(two).equals(BigInteger.ZERO))
			System.out.println(divideByTwoQuotient.pow(2));
		else
			System.out.println(divideByTwoQuotient.multiply((divideByTwoQuotient.add(BigInteger.ONE))));// System.out.println((numberOfCuts
	}
}

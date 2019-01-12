package com.nano.hacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author LXMRX You are given an integer N, can you check if the number is an
 *         element of fibonacci series? The first few elements of fibonacci
 *         series are 0,1,1,2,3,5,8,13…. A fibonacci series is one where every
 *         element is a sum of the previous two elements in the series. The
 *         first two elements are 0 and 1. Formally: fib0 = 0 fib1 = 1 fibn =
 *         fibn-1 + fibn-2 ∀ n > 1 Input Format First line contains T, number of
 *         test cases. T lines follows. Each line will contain an integer N.
 *         Output Format Output “IsFibo” (without quotes) if N is a fibonacci
 *         number and “IsNotFibo” (without quotes) if it is not a fibonacci
 *         number, in a new line corresponding to each test case. Constraints 1
 *         <= T <= 105 1 <= N <= 1010 Sample Input 3 5 7 8 Sample Output IsFibo
 *         IsNotFibo IsFibo Explanation 5 is a Fibonacci number given by fib5 =
 *         3 + 2 7 is not a Fibonacci number 8 is a Fibonacci number given by
 *         fib6 = 5 + 3
 */
public class IsFibo
{

	static Set<BigInteger>	fiboSet		= new TreeSet<BigInteger>();
	static String			isFibo		= "IsFibo";
	static String			isNotFibo	= "IsNotFibo";
	static BufferedReader	in			= new BufferedReader(new InputStreamReader(System.in));

	static
	{
		fillFiboSeries(100);
	}

	/**
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int t = Integer.parseInt(in.readLine());
		for (int i = 0; i < t; i++)
		{
			System.out.println(solve(in.readLine()));
		}

	}

	/**
	 * @param num
	 * @return String
	 */
	public static String solve(String num)
	{
		if (num.equals("0"))
			return isFibo;
		if (fiboSet.contains(new BigInteger(num)))
			return isFibo;
		else
			return isNotFibo;
	}

	/**
	 * @param seriesLength
	 */
	public static void fillFiboSeries(int seriesLength)
	{
		BigInteger t1 = BigInteger.ZERO;
		BigInteger t2 = BigInteger.ONE;
		BigInteger temp;
		for (int i = 1; i <= seriesLength; i++)
		{
			fiboSet.add(new BigInteger(String.valueOf(t2)));
			temp = t1;
			t1 = t2;
			t2 = temp.add(t2);
		}
	}
}

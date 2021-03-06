package com.nano.hacker.algo.bitmanipulation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Louise and Richard play a game. They have a counter set to N. Louise gets the
 * first turn and the turns alternate thereafter. In the game, they perform the
 * following operations.
 * 
 * If N is not a power of 2, they reduce the counter by the largest power of 2
 * less than N. If N is a power of 2, they reduce the counter by half of N. The
 * resultant value is the new N which is again used for subsequent operations.
 * The game ends when the counter reduces to 1, i.e., N == 1, and the last
 * person to make a valid move wins.
 * 
 * Given N, your task is to find the winner of the game.
 * 
 * Update If they set counter to 1, Richard wins, because its Louise' turn and
 * she cannot make a move.
 * 
 * Input Format The first line contains an integer T, the number of testcases. T
 * lines follow. Each line contains N, the initial number set in the counter.
 * 
 * Constraints
 * 
 * 1 ≤ T ≤ 10 1 ≤ N ≤ 264 - 1
 * 
 * Note: Range of N is larger than long long int, consider using unsigned long
 * long int.
 * 
 * Output Format
 * 
 * For each test case, print the winner's name in a new line. So if Louise wins
 * the game, print "Louise". Otherwise, print "Richard". (Quotes are for
 * clarity)
 * 
 * Sample Input
 * 
 * 1 6 Sample Output
 * 
 * Richard Explanation
 * 
 * As 6 is not a power of 2, Louise reduces the largest power of 2 less than 6
 * i.e., 4, and hence the counter reduces to 2. As 2 is a power of 2, Richard
 * reduces the counter by half of 2 i.e., 1. Hence the counter reduces to 1. As
 * we reach the terminating condition with N == 1, Richard wins the game.
 * 
 * @author LXMRX
 *
 */
public class CounterGame_Java7Way
{
    private static String LOUISE  = "Louise";
    private static String RICHARD = "Richard";

    public static void main(String[] args)
    {
	/*
	 * BigInteger n = new BigInteger("9");
	 * System.out.println(getHighestPowerOf2(n));
	 */
	/*
	 * System.out.println(n); System.out.println(n.bitCount());
	 * System.out.println(n.bitLength()); System.out.println("Flip Bit " +
	 * n.flipBit(3));
	 */

	Scanner scanner = new Scanner(System.in);
	int testCases = Integer.parseInt(scanner.nextLine());

	List<String> counterStringList = new ArrayList<>();
	for (int i = 0; i < testCases; i++)
	{
	    counterStringList.add(scanner.nextLine());
	}

	for (int i = 0; i < testCases; i++)
	{
	    process(counterStringList.get(i));
	}

	scanner.close();

    }

    private static void process(String counterString)
    {
	BigInteger counterBigInteger = new BigInteger(counterString);
	int attemptCount = 0;
	if (counterBigInteger.equals(BigInteger.ONE))
	{
	    System.out.println(RICHARD);
	}

	while (counterBigInteger.compareTo(BigInteger.ONE) == 1)
	{
	    if (isPowerOf2(counterBigInteger))
		counterBigInteger = counterBigInteger.shiftRight(1);
	    else
		counterBigInteger = counterBigInteger
			.subtract(getHighestPowerOf2(counterBigInteger));

	    attemptCount++;
	}

	if (attemptCount % 2 == 0)
	    System.out.println(RICHARD);
	else
	    System.out.println(LOUISE);
    }

    private static BigInteger getHighestPowerOf2(BigInteger bigInteger)
    {
	int bitLength = bigInteger.bitLength();
	for (int index = 0; index < (bitLength - 1); index++)
	    bigInteger = bigInteger.clearBit(index);
	return bigInteger;
    }

    private static boolean isPowerOf2(BigInteger bigInteger)
    {
	int bitLength = bigInteger.bitLength();
	for (int index = 0; index < bitLength - 1; index++)
	{
	    if (bigInteger.testBit(index))
		return false;
	}
	return true;
    }
}

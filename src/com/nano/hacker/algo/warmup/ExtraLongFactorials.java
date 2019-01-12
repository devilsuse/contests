package com.nano.hacker.algo.warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
	in.close();
	BigInteger bigNum = new BigInteger(String.valueOf(num));
	System.out.println(calculateFactorial(bigNum));
    }

    private static BigInteger calculateFactorial(BigInteger bigNum)
    {
	if (bigNum.equals(BigInteger.ONE))
	    return BigInteger.ONE;

	return bigNum.multiply(calculateFactorial(bigNum
		.subtract(BigInteger.ONE)));
    }
}

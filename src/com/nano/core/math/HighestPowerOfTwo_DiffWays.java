package com.nano.core.math;

import java.math.BigInteger;

public class HighestPowerOfTwo_DiffWays
{

    public static void main(String[] args)
    {
	BigInteger bigInteger = new BigInteger("99");
	System.out.println("getHighestPowerOf2_Method3 - "
		+ getHighestPowerOf2_Method3(bigInteger));
	System.out.println("getHighestPowerOf2_Method2 - "
		+ getHighestPowerOf2_Method2(bigInteger));
    }

    /*
     * this is wrong byte[] is not right datatype here we need something to
     * represent bits. private static BigInteger
     * getHighestPowerOf2_Method1(BigInteger bigInteger) { int bitLength =
     * bigInteger.bitLength(); byte[] arr = new byte[bitLength]; arr[0] = 1;
     * return new BigInteger(arr); }
     */

    /**
     * Best solution so far
     * 
     * @param bigInteger
     * @return
     */
    private static BigInteger getHighestPowerOf2_Method2(BigInteger bigInteger)
    {
	int bitLength = bigInteger.bitLength();
	return BigInteger.ZERO.setBit(bitLength - 1);
    }

    /**
     * My Method - Its expensive because in each iteration it creates new
     * BigInteger.
     * 
     * @param bigInteger
     * @return
     */
    private static BigInteger getHighestPowerOf2_Method3(BigInteger bigInteger)
    {
	int bitLength = bigInteger.bitLength();
	for (int index = 0; index < (bitLength - 1); index++)
	    bigInteger = bigInteger.clearBit(index);
	return bigInteger;
    }
}

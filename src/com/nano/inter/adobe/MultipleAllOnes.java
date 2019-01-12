package com.nano.inter.adobe;

import java.math.BigInteger;

/**
 * @author NanoUser For every number that has 3 in its units place has one
 *         multiple which has all one's i.e. 111 is such multiple for 3 and 13
 *         has a multiple 111111. Write a program to find such multiple for any
 *         number that has 3 at its units place. The number may not fit int or
 *         long
 */
public class MultipleAllOnes
{
    public static void main(String[] args)
    {
	BigInteger number = BigInteger.valueOf(13);
	BigInteger multiple = BigInteger.ONE;
	while (!multiple.mod(number).equals(BigInteger.ZERO))
	{
	    multiple = multiple.multiply(BigInteger.TEN).add(BigInteger.ONE);
	}

	System.out.println(multiple);
    }
}

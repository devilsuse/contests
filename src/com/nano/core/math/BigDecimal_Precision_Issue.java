package com.nano.core.math;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * @author LXMRX
 */
public class BigDecimal_Precision_Issue
{

	/**
	 * http://araklefeistel.blogspot.sg/2011/06/javamathbigdecimal-difference-
	 * between.html
	 * So calling round with a MathContext of 2 doesn't alway round to a
	 * precision of 2 digits overall. It depends on the number you're trying to
	 * round. Reading the JDK docs you will find
	 * ".... In general the rounding modes and precision setting determine how
	 * operations
	 * return results with a limited number of digits when the exact result has
	 * more digits (perhaps infinitely many in the case of division) than the
	 * number of
	 * digits returned. First, the total number of digits to return is specified
	 * by the MathContext's
	 * precision setting; this determines the result's precision. The digit
	 * count starts from the leftmost nonzero digit of the exact result.
	 * The rounding mode determines how any discarded trailing digits affect the
	 * returned result. ..."
	 * Oops, that is something you have to keep in mind when using round within
	 * BigDecimal. So if you really want to achieve a "real" rounding operation
	 * on a BigDecimal you should use setScale.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		BigDecimal smallNumber = new BigDecimal("0.01234");
		BigDecimal roundedNumber = smallNumber.round(new MathContext(2, RoundingMode.HALF_UP));
		System.out.println(roundedNumber);
		// Result = 0.012

		roundedNumber = smallNumber.setScale(2, RoundingMode.HALF_UP);
		System.out.println(roundedNumber);
		// Result = 0.01

		BigDecimal number = new BigDecimal("1.01234");
		roundedNumber = number.round(new MathContext(2, RoundingMode.HALF_UP));
		System.out.println(roundedNumber);
		// Result = 1.0

		roundedNumber = number.setScale(2, RoundingMode.HALF_UP);
		System.out.println(roundedNumber);
		// Result = 1.01
	}

}

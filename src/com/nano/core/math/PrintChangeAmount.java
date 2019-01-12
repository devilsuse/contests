package com.nano.core.math;

import java.math.BigDecimal;

/**
 * @author LXMRX
 */
public class PrintChangeAmount
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("--- Normal Print-----");
		double minuend = 2.0;
		// double
		double subtrahend = 1.1;
		System.out.println("with defined doubles " + (minuend - subtrahend));
		System.out.println(minuend);
		System.out.println(2.00 - 1.1);
		System.out.println(2.00 - 1.2);
		System.out.println(2.00 - 1.3);
		System.out.println(2.00 - 1.4);
		System.out.println(2.00 - 1.5);
		System.out.println(2.00 - 1.6);
		System.out.println(2.00 - 1.7);
		System.out.println(2.00 - 1.8);
		System.out.println(2.00 - 1.9);
		System.out.println(2.00 - 2);

		System.out.println("--- BigDecimal-----");
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.1")));
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.2")));
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.3")));
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.4")));
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.5")));
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.6")));
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.7")));
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.8")));
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.9")));
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("2")));

	}

}

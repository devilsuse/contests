package com.nano.core;

public class DecimalToOtherRadixSystemConversion
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int number = 9;

		System.out.println("To Binary - " + Integer.toBinaryString(number));

		System.out.println("To Hexa - " + Integer.toHexString(number));

		System.out.println("To Binary - " + Integer.toOctalString(number));

	}

}

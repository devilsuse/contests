package com.nano.core;

public class ClassLiteralTest
{

	static int[]	intArray	= new int[8];

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] a = new int[10];
		for (int i = 0; i < 10; i++)
			a[i]++;
		for (int i = 0; i < 10; i++)
			System.out.println(a[i]);

		System.out.println("intArray -> " + int[].class);
		System.out.println("Void -> " + Void.class);
		System.out.println("int -> " + int.class);
	}

}

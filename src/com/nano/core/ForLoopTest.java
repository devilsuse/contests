package com.nano.core;

public class ForLoopTest
{
    public static void main(String[] args)
    {

	System.out.println("-1 condition is checked....");
	/**
	 * No output here as -1 condition is checked after initialization and it
	 * fails
	 */
	for (int i = 0; i < -1; i++)
	    System.out.println(i + ".. ");

	System.out.println("Normal loop i < 4;.");
	/**
	 * No output here as -1 condition is checked after initialization and it
	 * fails
	 */
	for (int i = 0; i < 4; i++)
	    System.out.println(i + ".. ");

	System.out.println("pre-increment operator int i = 0; i < 4; i++;.");
	/**
	 * 
	 * fails
	 */
	for (int i = 0; i < 4; ++i)
	    System.out.println(i + ".. ");
    }
}

package com.nano.core;

public class ConfusingMethodORConstructor
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		TestClass test = new TestClass(null);
	}

}

class TestClass
{
	public TestClass(double[] doubleArray)
	{
		System.out.println("Double Array Constructor.........");
	}

	public TestClass(Object obj)
	{
		System.out.println("Object Constructor.........");
	}

	/*
	 * public TestClass(String str)
	 * {
	 * System.out.println("String Constructor..........");
	 * }
	 */
}
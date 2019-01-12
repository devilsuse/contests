package com.nano.core;

public class CloneTest
{

	private final Object	obj	= new Object();

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		CloneTest cloneTest = new CloneTest();

		try
		{
			CloneTest clone2 = (CloneTest) cloneTest.clone();
		}
		catch (CloneNotSupportedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

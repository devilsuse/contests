package com.nano.core.enumTest;

public class GetEnumAsString
{

	private enum MODE
	{
		MODE1,
		MODE2
	};

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		for (MODE mode : MODE.values())
			System.out.println(mode.name()); // Here mode.toString() works
												// equally well And toString()
												// is PREFERRED AS WELL.

	}

}

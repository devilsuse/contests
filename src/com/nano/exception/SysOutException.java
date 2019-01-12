package com.nano.exception;

/**
 * @author LXMRX
 */
public class SysOutException
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		try
		{
			wrapperMethod("str");
		}
		catch (NumberFormatException e)
		{
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();

		}
	}

	private static void parseInt(String str)
	{

		Integer.parseInt("dd");

	}

	private static void wrapperMethod(String str)
	{
		parseInt(str);
	}
}

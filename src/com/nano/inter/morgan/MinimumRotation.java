package com.nano.inter.morgan;

public class MinimumRotation
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		String str1 = "ABACD";
		String str2 = "CDABA";

		/*
		 * String str1 = "ABACD";
		 * String str2 = "BACDA";
		 */

		if (str1.length() != str2.length())
		{
			System.out.println(-1);
			return;
		}

		if (str1.equals(str2))
			System.out.println(0);

		char c = str2.charAt(0);
		int index = str1.indexOf(c);
		if (index < 0)
		{
			System.out.println(-1);
			return;
		}

		index = 0;
		int minimumPosition = -1;
		while (true)
		{
			index = str1.indexOf(c, index);
			if (index < 0)
				break;

			boolean isRotataion = isRotationAtThisPoint(index, str1, str2);
			if (isRotataion)
			{
				minimumPosition = caculateMinimumPosition(index, str1.length());
				break;
			}
		}

		if (minimumPosition != -1)
			System.out.println(minimumPosition);
	}

	/**
	 * @param index
	 * @param str1
	 * @param str2
	 * @return boolean
	 */
	public static boolean isRotationAtThisPoint(int index, String str1, String str2)
	{
		int rightSideLength = str1.length() - index;
		if (str1.substring(index).equals(str2.substring(0, rightSideLength))
				&& str1.substring(0, index).equals(str2.substring(rightSideLength)))
			return true;
		return false;
	}

	/**
	 * @param foundPosition
	 * @param stringLength
	 * @return int
	 */
	public static int caculateMinimumPosition(int foundPosition, int stringLength)
	{
		if (foundPosition <= stringLength / 2)
			return foundPosition;
		else
			return (stringLength - foundPosition);
	}
}

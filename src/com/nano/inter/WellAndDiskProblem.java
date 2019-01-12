package com.nano.inter;

/**
 * @author Amit
 */
public class WellAndDiskProblem
{
	private static boolean	wellBlocked	= false;
	private static int		ringInnerDiaMin;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// I assuming here the sizes of diameters, it can also be made to read
		// from files or as user input
		int[] solidDiskDia = { 2, 1, 4, 5, 6 };
		int[] ringInnerDia = { 32, 4, 6, 8, 15, 8, 11, 3 };
		ringInnerDiaMin = getMinValue(ringInnerDia);

		for (int i = 0; i < solidDiskDia.length; i++)
			System.out.println(solidDiskDia[i] + " --> " + diskGone(solidDiskDia[i]));
	}

	/**
	 * @param diskDiameter
	 * @return boolean
	 */
	public static boolean diskGone(int diskDiameter)
	{
		if (wellBlocked)
			return false;
		/**
		 * If diameter is less than inner Diameter, it will go inside the well.
		 * else it will get stuck
		 */
		if (diskDiameter < ringInnerDiaMin)
			return true;
		else
		{
			wellBlocked = true;
			return false;
		}
	}

	/**
	 * getting the miniumum value
	 * 
	 * @param array
	 * @return int
	 */
	public static int getMinValue(int[] array)
	{
		int minValue = array[0];
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] < minValue)
			{
				minValue = array[i];
			}
		}
		return minValue;
	}
}

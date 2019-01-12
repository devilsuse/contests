package com.nano.inter;

/**
 * @author Amit
 */
public class WihoutDivisionFillArray
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] input = { 2, 3, 5, 10 };
		int[] leftArray = new int[input.length];
		int leftmostValue = 1;

		// Building left array
		for (int i = 0; i < input.length; i++)
		{
			if (i == 0)
				leftArray[i] = leftmostValue;
			else
			{
				leftmostValue = leftmostValue * input[i - 1];
				leftArray[i] = leftmostValue;
			}
		}

		int[] rightArray = new int[input.length];
		int rightMostValue = 1;
		// Building right array
		for (int i = input.length - 1; i >= 0; i--)
		{
			if (i == input.length - 1)
				rightArray[i] = rightMostValue;
			else
			{
				rightMostValue = rightMostValue * input[i + 1];
				rightArray[i] = rightMostValue;
			}
		}
		// Building output array
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++)
		{
			output[i] = leftArray[i] * rightArray[i];
			System.out.println(output[i]);
		}
	}
}

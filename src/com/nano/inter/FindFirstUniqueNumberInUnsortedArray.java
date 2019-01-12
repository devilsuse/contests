package com.nano.inter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Write a program to find the first unique number in an unsorted array, given
 * that : 1, numbers can appear more than twice; 2, there may be more than one
 * unique number; 3, first means first appeared in the given unsorted array; 4,
 * if first means smallest, can anyone think out a solution other than firstly
 * sort the array?
 */
public class FindFirstUniqueNumberInUnsortedArray
{
	public static void main(String[] args)
	{
		int[] array = { 1, 3, 4, 2, 33, 11, 12, 3, 4, 54, 90, 0, 7, 1 };
		Map<Integer, Integer> timesMap = new LinkedHashMap<Integer, Integer>();

		for (int aElement : array)
		{
			if (timesMap.containsKey(aElement))
			{
				int count = timesMap.get(aElement).intValue();
				timesMap.put(aElement, ++count);
			}
			else
				timesMap.put(aElement, 1);
		}

		for (Integer i : timesMap.keySet())
			System.out.println(i + " appears " + timesMap.get(i) + " times in the unsorted array...");

		for (Integer i : timesMap.keySet())
		{
			if (timesMap.get(i).equals(Integer.valueOf(1)))
			{
				System.out.println("\n\nFirst Unique Number is " + i);
				break;
			}
		}

		/**
		 * When first means smallest
		 */

		int smallest = -1;
		boolean firstTimeInsideIfCondition = true;
		for (Integer i : timesMap.keySet())
		{
			if (timesMap.get(i).equals(Integer.valueOf(1)))
			{
				if (firstTimeInsideIfCondition)
				{
					smallest = i.intValue();
					firstTimeInsideIfCondition = false;
				}

				else
				{
					if (smallest > i.intValue())
						smallest = i.intValue();
				}
			}
		}
		if (firstTimeInsideIfCondition)
			System.out.println("No unique number exists...");
		else
			System.out.println("\n\nFirst SMALLEST Unique Number is " + smallest);
	}
}

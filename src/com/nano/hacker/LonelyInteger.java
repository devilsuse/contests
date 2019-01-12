package com.nano.hacker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LonelyInteger
{

	/* Head ends here */
	static int lonelyinteger(int[] a)
	{
		int lonelyInteger = 200;
		Map<Integer, Integer> integerToCountMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < a.length; index++)
		{
			Integer element = a[index];
			Integer tempVar = integerToCountMap.get(element);
			if (tempVar != null)
			{
				Integer prevCount = (Integer) integerToCountMap.get(element);
				integerToCountMap.put(element, ++prevCount);
				lonelyInteger = 200;
			}
			else
			{
				lonelyInteger = element;
				integerToCountMap.put(element, 1);
			}
		}
		if (lonelyInteger != 200)
		{
			System.out.println(lonelyInteger);
		}
		//
		// if (integerToCountMap.containsValue(1))
		// {
		// for (Map.Entry<Integer, Integer> entry :
		// integerToCountMap.entrySet())
		// {
		// if (entry.getValue().equals(1))
		// return entry.getKey();
		// }
		// }
		return 0;

	}

	/* Tail starts here */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int res;

		int _a_size = Integer.parseInt(in.nextLine());
		int[] _a = new int[_a_size];
		int _a_item;
		String next = in.nextLine();
		String[] next_split = next.split(" ");

		for (int _a_i = 0; _a_i < _a_size; _a_i++)
		{
			_a_item = Integer.parseInt(next_split[_a_i]);
			_a[_a_i] = _a_item;
		}

		res = lonelyinteger(_a);
		System.out.println(res);

	}
}

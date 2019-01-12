package com.nano.hacker.algo.bitmanipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ManipulativeNumbers
{
    /**
     * https://github.com/eLobato/java-algorithm-problems/blob/master/k-manipulative.java
     * @param args
     */
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int totalA = in.nextInt();
	int[] A = new int[totalA];

	for (int i = 0; i < totalA; i++)
	    A[i] = in.nextInt();

	Arrays.sort(A);
	Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();

	for (int k = 31; k > 0; k--)
	{

	    for (int i = 0; i < totalA; i++)
	    {
		int repeatedTimes = occurrences.containsKey(A[i] >> k) ? (occurrences
			.get(A[i] >> k) + 1) : 1;
		occurrences.put(A[i] >> k, repeatedTimes);
	    }

	    if (largestElement(occurrences) <= (totalA / 2))
	    {
		System.out.println(k);
		return;
	    }

	    for (Map.Entry<Integer, Integer> entry : occurrences.entrySet())
		occurrences.put(entry.getKey(), 0);
	}
    }

    public static int largestElement(Map<Integer, Integer> map)
    {
	int max = 0;

	for (Map.Entry<Integer, Integer> entry : map.entrySet())
	    if (max == 0 || entry.getValue() > max)
		max = entry.getValue();

	return max;
    }

}

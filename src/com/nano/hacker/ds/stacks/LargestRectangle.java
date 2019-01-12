package com.nano.hacker.ds.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Problem Statement
 * 
 * There are N buildings in a certain one-dimensional landscape. Each building
 * has a height given by hi,i∈[1,N]. If you join K adjacent buildings, they will
 * form a solid rectangle of area K×min(hi,hi+1,…,hi+k−1).
 * 
 * Given N buildings, find the greatest such solid area formed by consecutive
 * buildings.
 * 
 * Input Format The first line contains N, the number of buildings altogether.
 * The second line contains N space-separated integers, each representing the
 * height of a building.
 * 
 * Constraints 1≤N≤105 1≤hi≤106
 * 
 * Output Format One integer representing the maximum area of rectangle formed.
 * 
 * Sample Input
 * 
 * 5 1 2 3 4 5
 * 
 * Sample Output
 * 
 * 9
 * 
 * Explanation
 * 
 * @author lxmrx
 *
 */
public class LargestRectangle
{
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	int numberOfBuildings = Integer.parseInt(scanner.nextLine());

	List<Long> heights = new ArrayList<Long>(numberOfBuildings);
	for (int i = 0; i < numberOfBuildings; i++)
	{
	    heights.add(scanner.nextLong());
	}

	System.out.println(getMaxAreaUnoptimized(heights, numberOfBuildings));
	scanner.close();

    }

    private static long getMaxAreaUnoptimized(List<Long> heights,
	    int numberOfBuildings)
    {
	long maxArea = heights.get(0); // this will take care when input array
	// is of length 1.
	for (int i = 0; i < numberOfBuildings; i++)
	{
	    // int size = 1;
	    int size = 1;
	    List<Long> tempSublist = new ArrayList<Long>();
	    tempSublist.add(heights.get(i));

	    // boolean isNewElement = true;
	    while ((i + size) <= numberOfBuildings - 1)
	    {
		tempSublist.add(heights.get(i + size));
		// *****Not used anymore**** Below condition will reduce the
		// number of sorting required.
		// Sort only when new element is less than first element in temp
		// array.
		/*
		 * if (tempSublist.get(tempSublist.size() - 1) < tempSublist
		 * .get(0)) Collections.sort(tempSublist);
		 */

		// Instead of sorting, just maintain min value element at first
		// index, even if rest of the list is unsorted it doesn't
		// matter.
		// Only min element is interesting here. So just swap
		if (tempSublist.get(tempSublist.size() - 1) < tempSublist
			.get(0))
		{
		    Long min = tempSublist.get(tempSublist.size() - 1);
		    tempSublist.set(tempSublist.size() - 1, tempSublist.get(0));
		    tempSublist.set(0, min);
		}

		if (maxArea < ((size + 1) * tempSublist.get(0)))
		    maxArea = (size + 1) * tempSublist.get(0);
		size++;
	    }
	}

	return maxArea;
    }
}

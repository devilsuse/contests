package com.nano.hacker.java.collections;

import java.util.Scanner;

/**
 * Array is a very simple data structure which is used to store a collection of
 * data, for example roll number of all the students in a class or name of all
 * the countries in the world. To create an array of integer that can hold 10
 * values, you can write code like this:
 * 
 * int[] myList = new int[10]; This problem will test your knowledge on java
 * array. You are given an array of n integers. A sub-array is "Negative" if sum
 * of all the integers in that sub-array is negative. Count the number of
 * "Negative sub-arrays" in the input array.
 * 
 * Note: Subarrays are contiguous chunks of the main array. For example if the
 * array is {1,2,3,5} then some of the subarrays are {1}, {1,2,3}, {2,3,5},
 * {1,2,3,5} etc. But {1,2,5} is not an subarray as it is not contiguous.
 * 
 * Input Format
 * 
 * The first line consists an integer n. The next line will contain n space
 * separated integers. Value of n will be at most 100. The numbers in the array
 * will range between -10000 to 10000.
 * 
 * Output Format
 * 
 * Print the answer to the problem.
 * 
 * Sample Input
 * 
 * 5 1 -2 4 -5 1 Sample Output
 * 
 * 9
 * 
 * Explanation
 * 
 * These are the ranges of the 9 negative subarrays in this sample:
 * 
 * [0:1] [0:3] [0:4] [1:1] [1:3] [1:4] [2:3] [3:3] [3:4] Assume that the index
 * is 0 based.
 * 
 * @author LXMRX
 *
 */
public class Java1DArrayEasy
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] numArray = new int[n];
	int negativeSubArrayCount = 0;
	boolean allPositive = true;

	for (int i = 0; i < n; i++)
	{
	    numArray[i] = in.nextInt();

	    if (numArray[i] < 0)
		allPositive = false;
	}
	in.close();

	if (allPositive)
	{
	    System.out.println(0);
	    return;
	}

	for (int i = 0; i < n; i++)
	{
	    int sum = 0;
	    for (int j = i; j < n; j++)
	    {
		int temp = numArray[j];
		if (temp < 0 && i == j) // i==j is very imp
		{
		    negativeSubArrayCount++;
		    sum += temp;
		    continue;
		}

		sum += temp;

		if (sum < 0)
		    negativeSubArrayCount++;
	    }
	}
	System.out.println(negativeSubArrayCount);

    }

}

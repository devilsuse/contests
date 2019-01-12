package com.nano.hacker.algo.dynamicprogramming;

import java.util.Scanner;

public class MaximumSubArrayProblem
{
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	int totalTestCases = Integer.parseInt(scanner.nextLine());

	String[] lenthArray = new String[totalTestCases];
	String[] inputLines = new String[totalTestCases];

	for (int i = 0; i < totalTestCases; i++)
	{
	    lenthArray[i] = scanner.nextLine();
	    inputLines[i] = scanner.nextLine();
	}

	for (int i = 0; i < totalTestCases; i++)
	    System.out.println(calculateMaxSubArraySum(inputLines[i],
		    Integer.parseInt(lenthArray[i])));

	scanner.close();
    }

    private static String calculateMaxSubArraySum(String inputLine, int length)
    {
	// String maxSum = "";
	String[] numStringArray = inputLine.split(" ");
	long maxSum = 0l;
	long currentSum = 0l;
	boolean allNegative = true;
	long sumAllPositiveNums = 0;

	int maxAmongNegative = 0; // This will store maximum number in case of
				  // all negative numbers.
	for (int i = 0; i < length; i++)
	{
	    int num = Integer.parseInt(numStringArray[i]);

	    currentSum += num;
	    if (maxSum < currentSum)
	    {
		maxSum = currentSum;
	    }
	    else if (currentSum < 0)
		currentSum = 0;

	    // Handling for non-contiguous max sum And in case if all -ve
	    // numbers.
	    if (num > 0)
	    {
		allNegative = false;
		sumAllPositiveNums += num;
	    }
	    // in case of all -ve nums, track max -ve num i.e that with min
	    // absolute value.
	    else if ((maxAmongNegative == 0 && num < 0)
		    || (maxAmongNegative != 0 && maxAmongNegative < num)) // this big condition is imp
	    {

		maxAmongNegative = num;
	    }
	}

	if (allNegative)
	    return maxAmongNegative + " " + maxAmongNegative;
	else
	    return maxSum + " " + sumAllPositiveNums;
    }
}

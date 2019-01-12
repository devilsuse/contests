package com.nano.inter.adobe;

import com.manthano.sort.MergeSort;

public class SumOfTwoNumbersInArray
{

    public static void main(String[] args)
    {
	int[] array = { 11, 18, 21, 28, 31, 38, 40, 55, 60, 62 };
	MergeSort.mergeSort(array);
	// mergeSort.printArray(array);

	int sum = 66;
	System.out.println(isSumPossible(array, sum));
    }

    private static int isSumPossible(int[] a, int sum)
    {
	int i = 0;
	int j = a.length - 1;

	while (i < j)
	{
	    if (a[i] + a[j] == sum)
		return 1;
	    else if (a[i] + a[j] < sum)
		i++;
	    else
		j--;
	}
	return 0;
    }

}

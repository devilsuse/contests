package com.manthano.sort;

/**
 * @author NanoUser - Written by Me https://www.youtube.com/watch?v=TzeBrDU-JaY
 *         http
 *         ://www.buildingjavaprograms.com/code_files/3ed/ch13/MergeSort.java
 *
 */
public class MergeSort
{
    public static void main(String[] args)
    {
	int[] arr = { 1, 3, 4, 6, 10, 2, 5, 8, 7, 9 };
	printArray(arr);
	System.out.println();
	mergeSort(arr);
	System.out.println();
	printArray(arr);
    }

    public static void mergeSort(int[] arr)
    {
	if (arr.length < 2)
	    return;

	int middleIndex = arr.length / 2;
	int[] leftSubArray = getArray(arr, 0, middleIndex);
	int[] rightSubArray = getArray(arr, middleIndex, arr.length);
	// printArray(leftSubArray);
	// printArray(rightSubArray);
	mergeSort(leftSubArray);
	mergeSort(rightSubArray);
	merge(arr, leftSubArray, rightSubArray);
    }

    private static void merge(int[] arr, int[] leftSubArray, int[] rightSubArray)
    {
	int i = 0, j = 0, k = 0;
	int nL = leftSubArray.length;// leftArrayLength
	int nR = rightSubArray.length;// rightArrayLength

	while (i < nL && j < nR)
	{
	    if (leftSubArray[i] <= rightSubArray[j])
	    {
		arr[k] = leftSubArray[i];
		i++;
	    }
	    else
	    {
		arr[k] = rightSubArray[j];
		j++;
	    }
	    k++;
	}

	while (i < nL)
	{
	    arr[k] = leftSubArray[i];
	    i++;
	    k++;
	}

	while (j < nR)
	{
	    arr[k] = rightSubArray[j];
	    j++;
	    k++;
	}
    }

    private static int[] getArray(int[] arr, int lowerIndex, int upperIndex)
    {
	int[] temp = new int[upperIndex - lowerIndex];
	for (int i = 0; i < temp.length; i++)
	{
	    temp[i] = arr[lowerIndex++];
	}
	return temp;
    }

    public static void printArray(int[] a)
    {
	for (int i = 0; i < a.length; i++)
	    System.out.print(a[i] + " ");
	System.out.println();
    }
}

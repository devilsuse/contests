package com.nano.inter.adobe;

import java.util.Scanner;

public class MaxOnes
{
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	int row = scanner.nextInt();
	int column = scanner.nextInt();

	int[][] arr = new int[row][column];

	populateArray(arr, row, column, scanner);
	scanner.close();

	System.out.println(process(arr, row, column));
    }

    private static int process(int[][] arr, int row, int column)
    {
	int maxOneCount = -1;
	int maxOnesRowNumber = 0;

	for (int i = 0; i < row; i++)
	{
	    int rowOnesCount = 0;

	    for (int j = 0; j < column; j++)
	    {
		if (arr[i][j] == 0)
		    break;
		else
		{
		    rowOnesCount++;
		}
	    }
	    if (rowOnesCount > 0 && rowOnesCount > maxOneCount)
	    {
		maxOneCount = rowOnesCount;
		maxOnesRowNumber = i;
	    }
	}
	return maxOnesRowNumber;
    }

    private static void populateArray(int[][] arr, int row, int column,
	    Scanner scanner)
    {
	for (int i = 0; i < row; i++)
	{
	    for (int j = 0; j < column; j++)
	    {
		arr[i][j] = scanner.nextInt();
	    }
	}
    }

}

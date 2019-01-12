package com.nano.hacker.algo.warmup;

import java.util.Scanner;

public class DiagonalDifference
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int t;
	t = Integer.parseInt(in.nextLine());
	int[][] a = new int[t][t];
	int mainDiagonalSum = 0;

	for (int i = 0; i < t; i++)
	{
	    for (int j = 0; j < t; j++)
	    {
		a[i][j] = in.nextInt();
		if (i == j)
		    mainDiagonalSum += a[i][j];
	    }
	}

	int i = 0, j = t - 1;
	int oppoDiagonalSum = 0;
	while (i < t)
	{
	    oppoDiagonalSum += a[i][j];
	    i++;
	    j--;
	}
	System.out.println(Math.abs(oppoDiagonalSum - mainDiagonalSum));
	in.close();
    }
}

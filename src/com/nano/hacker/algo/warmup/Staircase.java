package com.nano.hacker.algo.warmup;

import java.util.Scanner;

public class Staircase
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();

	int numOfSpaces = 0;
	for (int i = 1; i <= t; i++)
	{
	    numOfSpaces = t - i;

	    for (int j = 1; j <= numOfSpaces; j++)
		System.out.print(" ");

	    for (int k = 1; k <= i; k++)
		System.out.print("#");

	    System.out.println();
	}
	in.close();
    }
}

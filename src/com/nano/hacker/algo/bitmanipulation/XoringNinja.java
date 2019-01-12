package com.nano.hacker.algo.bitmanipulation;

import java.util.Scanner;

public class XoringNinja
{

    public static void main(String[] args)
    {

	Scanner scanner = new Scanner(System.in);
	int testCases = Integer.parseInt(scanner.nextLine());

	String numberLine = null;
	String[] numbersStringArray = null;
	int arrayLength = 0;
	int[][] numbersArray = new int[testCases][];
	;
	for (int i = 0; i < testCases; i++)
	{
	    arrayLength = Integer.parseInt(scanner.nextLine());
	    numberLine = scanner.nextLine();
	    numbersStringArray = numberLine.split(" ");
	    for (int j = 0; j < arrayLength; j++)
		numbersArray[i][j] = Integer.parseInt(numbersStringArray[j]);
	}

	for (int i = 0; i < testCases; i++)
	{
	    process(numbersArray[i]);
	}

	scanner.close();

    }

    private static void process(int[] numbersArray)
    {
	int length = numbersArray.length;

    }
}

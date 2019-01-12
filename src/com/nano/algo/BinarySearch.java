package com.nano.algo;

import java.io.Console;

public class BinarySearch
{
	public static void main(String[] args)
	{
		// Scanner scanner = new Scanner(System.in);
		Console console = System.console();
		String firstLine = console.readLine("Please enter length of array and key element to be found...");
		String[] firstLineArray = firstLine.split("\\s");
		System.out.println("Read line : " + firstLine);
		int firstLineArraySize = firstLineArray.length;

		System.out.println("Number of parameters entered in First line: " + firstLineArraySize);
		int inputArrSize = Integer.parseInt(firstLineArray[0]);

		System.out.println("Array length: " + inputArrSize);
		if (firstLineArraySize != 2)
		{
			System.out.println("Wrong number of parameters passed.");
			System.exit(1);
		}

		int key = Integer.parseInt(firstLineArray[1]);

		System.out.println(inputArrSize + " : " + key);
	}
}

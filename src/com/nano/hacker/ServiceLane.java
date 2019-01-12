package com.nano.hacker;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author LXMRX
 */
public class ServiceLane
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		String firstLine = scanner.nextLine();
		StringTokenizer stringTokenizer = new StringTokenizer(firstLine, " ");

		int numberOfEntringIntoLane = Integer.parseInt(stringTokenizer.nextToken());
		int testCases = Integer.parseInt(stringTokenizer.nextToken());

		String secondLine = scanner.nextLine();
		stringTokenizer = new StringTokenizer(secondLine, " ");
		int[] laneWidth = new int[numberOfEntringIntoLane];

		for (int i = 0; i < numberOfEntringIntoLane; i++)
		{
			laneWidth[i] = Integer.parseInt(stringTokenizer.nextToken());
		}

		int[] entry = new int[testCases];
		int[] exit = new int[testCases];
		String nextLine = null;
		String[] split = null;
		for (int i = 0; i < testCases; i++)
		{
			nextLine = scanner.nextLine();
			split = nextLine.split(" ");
			entry[i] = Integer.parseInt(split[0]);
			exit[i] = Integer.parseInt(split[1]);
		}

		for (int i = 0; i < testCases; i++)
			printLargestVehicleWidth(entry[i], exit[i], laneWidth);

	}

	/**
	 * @param entry
	 * @param exit
	 * @param lanewidth
	 */
	public static void printLargestVehicleWidth(int entry, int exit, int[] lanewidth)
	{
		// System.out.println(entry + " : " + exit);
		/**
		 * Intializing to impossible value, so validate during output. Possible
		 * values are 1,2 and 3
		 */
		int largestVehicleSize = 4;
		for (int i = entry; i <= exit; i++)
		{
			if (largestVehicleSize > lanewidth[i])
				largestVehicleSize = lanewidth[i];
		}

		if (largestVehicleSize == 4)
			System.out.println("Something Went Wrong");
		else
			System.out.println(largestVehicleSize);
	}

}

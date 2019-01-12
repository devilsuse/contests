package com.nano.hacker.algo.geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author LXMRX
 */
public class FindPoint
{

	/**
	 * Problem statement
	 * Given two points P and Q, output the symmetric point of point P about Q.
	 * Input format:
	 * The first line contains an integer T representing the number of testcases
	 * (T <= 15)
	 * Each test case contains Px Py Qx Qy representing the (x,y) coordinates of
	 * P and Q, all of them being integers.
	 * Constraints
	 * 1 <= T <= 15
	 * -100 <= x, y <= 100
	 * Output format
	 * For each test case output x and y coordinates of the symmetric point
	 * Sample input
	 * 1
	 * 0 0 1 1
	 * Sample output
	 * 2 2
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int totalTestCases = Integer.parseInt(scanner.nextLine());

		String line = null;
		List<String> inputLines = new ArrayList<>();
		for (int i = 0; i < totalTestCases; i++)
		{
			line = scanner.nextLine();
			inputLines.add(line);
		}

		for (int i = 0; i < totalTestCases; i++)
		{
			line = inputLines.get(i);
			String[] points = line.split(" ");
			if (points.length == 4)
			{
				findPoint(Integer.parseInt(points[0]), Integer.parseInt(points[1]), Integer.parseInt(points[2]),
						Integer.parseInt(points[3]));
			}
		}

		scanner.close();
	}

	static void findPoint(int px, int py, int qx, int qy)
	{
		System.out.println(qx + (qx - px) + " " + (qy + (qy - py)));
	}

}

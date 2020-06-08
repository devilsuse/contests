package com.nano.hacker.java.collections;

import java.util.Scanner;

/**
 * @author LXMRX Problem Statement
 * 
 *         You are playing a game on your cellphone. You are given an array of
 *         length n, indexed from 0 to n−1. Each element of the array is either
 *         0 or 1. You can only move to an index which contains 0. At first you
 *         are at the 0th position. In each move you can do one of the following
 *         things:
 * 
 *         Walk one step forward or backward. Make a jump of exactly length m
 *         forward. That means you can move from position x to x+1, x−1 or x+m
 *         in one move. The new position must contain 0. Also you can move to
 *         any position greater than n-1.
 * 
 *         You can't move backward from position 0. If you move to any position
 *         greater than n−1, you win the game.
 * 
 *         Given the array and the length of the jump, you need to determine if
 *         it's possible to win the game or not.
 * 
 *         Input Format
 * 
 *         In the first line there will be an integer T denoting the number of
 *         test cases. Each test case will consist of two lines. The first line
 *         will contain two integers, n and m. On the second line there will be
 *         n space-separated integers, each of which is either 0 or 1.
 * 
 *         Constraints:
 * 
 *         1<=T<=5000 2≤n≤100 0≤m≤100 The first integer of the array is always
 *         0.
 * 
 *         Output Format
 * 
 *         For each case output "YES" if it's possible to win the game, output
 *         "NO" otherwise.
 * 
 *         Sample Input
 * 
 *         4 5 3 0 0 0 0 0 6 5 0 0 0 1 1 1 6 3 0 0 1 1 1 0 3 1 0 1 0 Sample
 *         Output
 * 
 *         YES YES NO NO Explanation
 * 
 *         In the first case you can just walk to reach the end of the array. In
 *         the second case, you can walk to index 1 or 2 and jump from there. In
 *         the third case, jump length is too low, you can't reach the end of
 *         the array. In the fourth case, jump length is 1, so it doesn't matter
 *         if you jump or walk, you can't reach the end.
 */
public class Java1DArrayHard
{
	private static final String YES = "YES";
	private static final String NO  = "NO";

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int totalTestCases = Integer.parseInt(scanner.nextLine());
		int[][] numArr = new int[totalTestCases][];
		int[] jumpArr = new int[totalTestCases];
		String[] solutions = new String[totalTestCases];

		for (int i = 0; i < totalTestCases; i++)
		{
			int arraySize = scanner.nextInt();
			numArr[i] = new int[arraySize];// first read the array size
			jumpArr[i] = scanner.nextInt();// then jump value

			int successiveOnes = 0;
			for (int j = 0; j < arraySize; j++)
			{
				int temp = scanner.nextInt();
				numArr[i][j] = temp;

				if (temp == 1)
				{
					if (++successiveOnes == jumpArr[i])
					{
						solutions[i] = NO;
					}
				}
				else if (solutions[i] == null)// RESET count to zero only if its
					// NOT solved Yet
				{
					successiveOnes = 0;
				}
			}
		}
		scanner.close();

		for (int i = 0; i < totalTestCases; i++)
		{
			if (solutions[i] == null)
				solve(numArr[i], jumpArr[i], solutions, i);

			System.out.println(solutions[i]);
		}
	}

	private static void solve(int[] maze, int jump, String[] solutions,
			int solutionIndex)
	{

		if (solutions[solutionIndex] != null)
			return; // Its already solved, so dont process it.

		int[] incrementArray = new int[3];
		incrementArray[0] = jump;
		incrementArray[1] = 1;
		incrementArray[2] = -1;

		int size=maze.length;
		// int stepsAlreadyUndertaken = maze.length;
		for (int i = 0; i < maze.length;)
		{
			if (solutions[solutionIndex] != null)// means this array is already
				// solved
				return;


			/*
			 * stepsAlreadyUndertaken--; if (stepsAlreadyUndertaken < 0) {
			 * solutions[solutionIndex] = NO; return; }
			 */
			// int currentPosition = maze[i];

			int newPosition = i + jump; 
			if ((newPosition >= size) || maze[i +jump] == 0) 
			{ 
				if (newPosition >= size) 
				{ 
					solutions[solutionIndex]= YES; break; 
					} else 
					{ i = newPosition;// currentPosition =
			           //newPosition; 
			           continue; }

			} else if(((newPosition = i + 1) >= size)) {

			}

			/*
			 * for (int j = 0; j < 3; j++) { if (solutions[solutionIndex] ==
			 * null) { i = possibleNextPosition(maze, i, incrementArray[j],
			 * solutions, solutionIndex); } else { break; } }
			 */
		}

	}

	private static int possibleNextPosition(int[] maze, int currentPosition,
			int increment, String[] solutions, int solutionIndex)
	{
		int size = maze.length;
		int newPosition = currentPosition + increment;
		if ((newPosition >= size) || maze[newPosition] == 0)
		{
			if (newPosition >= size)
			{
				solutions[solutionIndex] = YES;
				return 0; // as solution is reached, this number won't be
				// checked.. So returning zero is ok.
			}
			else
			{
				newPosition = currentPosition + increment;
				return newPosition;
			}

		}
		return currentPosition;
	}
}

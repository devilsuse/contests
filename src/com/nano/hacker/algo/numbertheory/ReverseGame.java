package com.nano.hacker.algo.numbertheory;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This is getting TIMEOUT - Need to improve performance
 * 
 * Akash and Akhil are playing a game. They have N balls numbered from 0 to N−1.
 * Akhil asks Akash to reverse the position of the balls, i.e., to change the
 * order from say, 0,1,2,3 to 3,2,1,0. He further asks Akash to reverse the
 * position of the balls N times, each time starting from one position further
 * to the right, till he reaches the last ball. So, Akash has to reverse the
 * positions of the ball starting from 0th position, then from 1st position,
 * then from 2nd position and so on. At the end of the game, Akhil will ask
 * Akash the final position of any ball numbered K. Akash will win the game, if
 * he can answer. Help Akash.
 * 
 * Input Format The first line contains an integer T, i.e., the number of the
 * test cases. The next T lines will contain two integers N and K.
 * 
 * Output Format Print the final index in array.
 * 
 * Constraints 1≤T≤50 1≤N≤105 0≤K<N Sample Input
 * 
 * 2 3 1 5 2 Sample Output
 * 
 * 2 4 Explanation For first test case, The rotation will be like this: 0 1 2 ->
 * 2 1 0 -> 2 0 1 -> 2 0 1 So, Index of 1 will be 2.
 * 
 * @author LXMRX
 *
 */
public class ReverseGame
{

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	int testsCount = in.nextInt();
	for (int t = 0; t < testsCount; t++)
	{
	    int n = in.nextInt();
	    int k = in.nextInt();
	    // Simulates all rotations,
	    // but keeps track only of the k-th ball.
	    // It does not matter what happens to the others.
	    for (int i = 0; i < n; i++)
		if (k >= i)
		    k = i + n - 1 - k;
	    out.println(k);
	}
	out.flush();
	in.close();
    }

    /*
     * public static void main(String[] args) { Scanner scanner = new
     * Scanner(System.in); int testCases = Integer.parseInt(scanner.nextLine());
     * int[] numberOFBalls = new int[testCases]; int[] ballNumberArray = new
     * int[testCases];
     * 
     * for (int i = 0; i < testCases; i++) { numberOFBalls[i] =
     * scanner.nextInt(); ballNumberArray[i] = scanner.nextInt(); }
     * 
     * for (int i = 0; i < testCases; i++) { process(numberOFBalls[i],
     * ballNumberArray[i]); } scanner.close(); }
     */

    private static void process(int totalNumberOFBalls, int ballNumber)
    {
	int[] ballsArray = new int[totalNumberOFBalls];
	int maximumNumberOnBall = totalNumberOFBalls - 1; // This is because
							  // balls are numbered
							  // from 0.
	// As the first step is to reverse the Balls arrangement, So insert into
	// ballsArray in descending order of index.
	for (int i = 0; i < totalNumberOFBalls; i++)
	    ballsArray[i] = maximumNumberOnBall--;

	for (int i = 1; i < totalNumberOFBalls; i++)
	{
	    ballsArray = reverseSubArray(ballsArray, i);
	}

	int position = findPosition(ballsArray, ballNumber);
	System.out.println(position);
    }

    private static int[] reverseSubArray(int[] a, int fromIndex)
    {
	int temp = 0, counter = 1;
	int midIndex = (a.length - fromIndex) / 2;
	for (int i = fromIndex; i < fromIndex + midIndex; i++)
	{
	    temp = a[a.length - (counter)];
	    a[a.length - (counter)] = a[i];
	    a[i] = temp;
	    counter++;
	}

	/*
	 * System.out.println(); for (int i = 0; i < a.length; i++)
	 * System.out.print(a[i] + " ");
	 */
	return a;
    }

    private static int[] reverseSubArraySLOW_Performace(int[] array,
	    int fromIndex)
    {
	int tempArray[] = new int[array.length];
	int indexCounter = 1;

	for (int i = 0; i < fromIndex; i++)
	{
	    tempArray[i] = array[i];
	}
	for (int i = fromIndex; i < array.length; i++)
	{
	    tempArray[i] = array[array.length - (indexCounter++)];
	}

	return tempArray;
    }

    private static int findPosition(int[] ballsArray, int ballNumber)
    {
	for (int i = 0; i < ballsArray.length; i++)
	{
	    if (ballsArray[i] == ballNumber)
		return i;
	}
	return 0;
    }

}

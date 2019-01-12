package com.nano.hacker.contest;

import java.util.Scanner;

public class SherlockAndWatson_ArrayRotation
{

	/**
	 * John Watson performs an operation called Right Circular Rotation on an
	 * integer array a0,a1 … an-1. Right Circular Rotation transforms the array
	 * from a0,a1 … aN-1 to aN-1,a0,… aN-2. He performs the operation K times
	 * and tests Sherlock’s ability to identify the element at a particular
	 * position in the array. He asks Q queries. Each query consists of one
	 * integer x, for which you have to print the element ax. Input Format The
	 * first line consists of 3 integers N, K and Q separated by a single space.
	 * The next line contains N space separated integers which indicates the
	 * elements of the array A. Each of the next Q lines contain one integer per
	 * line denoting x. Output Format For each query, print the value in the
	 * location in a newline. Constraints 1 ≤ N ≤ 105 1 ≤ A[i] ≤ 105 1 ≤ K ≤ 105
	 * 1 ≤ Q ≤ 500 0 ≤ x ≤ N-1 Sample input 3 2 3 1 2 3 0 1 2 Sample output 2 3
	 * 1 Explanation After one rotation array becomes, 3 1 2. After another
	 * rotation array becomes 2 3 1. Final array now is 2,3,1. 0th element of
	 * array is 2. 1st element of array is 3. 2nd element of array is 1.
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		String n = in.nextLine();
		String[] n_split = n.split(" ");

		int a_size = Integer.parseInt(n_split[0]);
		int k = Integer.parseInt(n_split[1]);
		int q = Integer.parseInt(n_split[2]);

		int[] _a = new int[a_size];
		int _a_item;
		String next = in.nextLine();
		String[] next_split = next.split(" ");

		for (int _a_i = 0; _a_i < a_size; _a_i++)
		{
			_a_item = Integer.parseInt(next_split[_a_i]);
			_a[_a_i] = _a_item;
		}

		int[] queries = new int[q];
		for (int j = 0; j < q; j++)
			queries[j] = Integer.parseInt(in.nextLine());

		int[] arrayAfterRotation = rotateArray(_a, k);

		for (int j = 0; j < q; j++)
			System.out.println(arrayAfterRotation[queries[j]]);
	}

	/**
	 * @param a
	 * @param k
	 * @return int[]
	 */
	public static int[] rotateArray(int[] a, int k)
	{
		int size = a.length;

		k = k % size;
		int[] temp = new int[size];

		for (int i = 0; i < size; i++)
		{
			if (i + k <= size - 1)
				temp[i + k] = a[i];
			else
				temp[i + k - size] = a[i];
		}
		return temp;
	}
}

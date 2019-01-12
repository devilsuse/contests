package com.nano.hacker.algo.string;

import java.util.Scanner;

public class CountPalindromes
{

    /**
     * Problem Statement
     * 
     * A string is made of only lowercase latin letters (a,b,c,d,.....,z). Can
     * you find the length of the lexicographically smallest string such that it
     * has exactly K sub-strings, each of which are palindromes?
     * 
     * Input Format The first line of input contains single integer T - the
     * number of testcases. T lines follow, each containing the integer K.
     * 
     * Output Format Output exactly T lines. Each line should contain single
     * integer - the length of the lexicographically smallest string.
     * 
     * Constraints: 1 <= T <= 100 1 <= K <= 1012
     * 
     * Sample input
     * 
     * 2 10 17 Sample Output
     * 
     * 4 7 Explanation
     * 
     * for K = 10, one of the smallest possible strings that satisfies the
     * property is aaaa. All 10 palindromes are
     * 
     * a,a,a,a aa, aa, aa aaa, aaa aaaa Note
     * 
     * Two sub-strings with different indices are both counted.
     * 
     * @param args
     */
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	int totalTestCases = Integer.parseInt(scanner.nextLine());

	for (int i = 0; i < totalTestCases; i++)
	{

	}
	scanner.close();
    }

}

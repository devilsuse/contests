package com.nano.hacker;

import java.util.Scanner;

/**
 * Sherlock Holmes is getting paranoid about Professor Moriarty, his archenemy.
 * All his efforts to subdue Moriarty have been in vain. These days Sherlock is
 * working on a problem with Dr. Watson. Watson mentioned that the CIA have been
 * having weird problems with their supercomputer ‘The Beast’ recently. This
 * afternoon, Sherlock received a note from Moriarty, saying he has infected
 * ‘The Beast’ with a virus. In addition the note had the number ‘N’ printed on
 * it. After doing some calculations, Sherlock found out that the key to remove
 * the virus is the largest ‘Decent’ Number having ‘N’ digits. A ‘Decent’ Number
 * has - 1. Only 3 and 5 as its digits. 2. Number of times 3 appears is
 * divisible by 5. 3. Number of times 5 appears is divisible by 3. Meanwhile,
 * the counter to destruction of ‘The Beast’ is running very fast. Can you save
 * ‘The Beast’ and find the key before Sherlock? Input Format 1st line will
 * contain an integer T, the number of test cases, followed by T lines, each
 * line containing an integer N i.e. the number of digits in the number Output
 * Format Largest Decent number having N digits. If no such number exists, you
 * tell Sherlock that he is wrong and print ‘-1’ Constraints 1<=T<=20
 * 1<=N<=100000 Sample Input 4 1 3 5 11 Sample Output -1 555 33333 55555533333
 * Explanation For N=1 , there is no such number. for N=3, 555 is only possible
 * number. For N=5, 33333 is only possible number. For N=11 , 55555533333 and
 * all of permutations of digits are valid numbers, among them, the given number
 * is the largest one.
 * 
 * @author LXMRX
 */
public class SherlockAndBeast
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	for (int i = 0; i < t; i++)
	{
	    System.out.println(solve(in.nextInt()));
	}
	in.close();
    }

    private static String solve(int length)
    {
	if (length < 3)
	    return "-1";

	int numOf5Digits = lengthOf5(length);
	int numOf3Digits = lengthOf3(numOf5Digits, length);// length -
							   // numOf5Digits;

	// System.out.println(" length calculation successful: " + numOf5Digits
	// + " --  " + numOf3Digits);
	if (numOf3Digits == 0 && numOf5Digits == 0)
	    return "-1";

	StringBuilder number = new StringBuilder(length);

	for (int i = 0; i < numOf5Digits; i++)
	    number.append("5");
	for (int i = 0; i < numOf3Digits; i++)
	    number.append("3");
	if (number.length() == 0)
	    return "-1";

	return number.toString();

    }

    private static int lengthOf3(int numOf5Digits, int length)
    {
	if (numOf5Digits == 0)
	{
	    if (length % 5 == 0)
		return length;
	    else
		return 0;
	}
	return length - numOf5Digits;
    }

    private static int lengthOf5(int length)
    {
	// if length is divisible by 3 then all digits should be 5
	if (length % 3 == 0)
	    return length;

	int temp = length;

	while (temp > 3)
	{
	    temp = temp - 5;
	    if (temp % 3 == 0)
		break;
	}

	if (temp % 3 == 0)
	    return temp;

	return 0;
    }
}

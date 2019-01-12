package com.nano.hacker.algo.warmup;

import java.util.Scanner;

/**
 * 
 Problem Statement
 * 
 * The Head Librarian at a library wants you to make a program that calculates
 * the fine for returning the book after the return date. You are given the
 * actual and the expected return dates. Calculate the fine as follows:
 * 
 * If the book is returned on or before the expected return date, no fine will
 * be charged, in other words fine is 0. If the book is returned in the same
 * month as the expected return date, Fine = 15 Hackos × Number of late days If
 * the book is not returned in the same month but in the same year as the
 * expected return date, Fine = 500 Hackos × Number of late months If the book
 * is not returned in the same year, the fine is fixed at 10000 Hackos.
 * 
 * Input Format
 * 
 * You are given the actual and the expected return dates in D M Y format
 * respectively. There are two lines of input. The first line contains the D M Y
 * values for the actual return date and the next line contains the D M Y values
 * for the expected return date.
 * 
 * Constraints 1≤D≤31 1≤M≤12 1≤Y≤3000
 * 
 * Output Format
 * 
 * Output a single value equal to the fine.
 * 
 * Sample Input
 * 
 * 9 6 2015 6 6 2015
 * 
 * Sample Output
 * 
 * 45
 * 
 * Explanation
 * 
 * Since the actual date is 3 days late than expected, fine is calculated as
 * 15×3=45 Hackos.
 * 
 * @author LXMRX
 *
 */
public class LibraryFine
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int actualRetDate = in.nextInt();
	int actualRetMonth = in.nextInt();
	int actualRetYear = in.nextInt();

	int expectedRetDate = in.nextInt();
	int expectedRetMonth = in.nextInt();
	int expectedRetYear = in.nextInt();

	in.close();

	int fine = 0;
	// EDITORIAL section has nice looking code than mine(below) :(
	// So check that for better sol
	if (expectedRetYear == actualRetYear)
	{
	    if (expectedRetMonth == actualRetMonth)
	    {
		if (actualRetDate <= expectedRetDate)
		    fine = 0;
		else
		    fine = 15 * (actualRetDate - expectedRetDate);
	    }
	    else if (actualRetMonth > expectedRetMonth)
	    {
		fine = 500 * (actualRetMonth - expectedRetMonth);
	    }
	    else if (actualRetMonth < expectedRetMonth)
		fine = 0;
	}
	else if (actualRetYear > expectedRetYear)
	    fine = 10000;
	else if (actualRetYear < expectedRetDate)
	    fine = 0;

	System.out.println(fine);
    }
}

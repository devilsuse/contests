package com.nano.hacker.algo.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int t;
	t = in.nextInt();
	int countPositive = 0, countNegative = 0, countZero = 0, num = 0;
	for (int i = 0; i < t; i++)
	{
	    num = in.nextInt();

	    if (num > 0)
		countPositive++;
	    else if (num < 0)
		countNegative++;
	    else
		countZero++;
	}
	in.close();

	System.out.println(round(countPositive, t, 3));
	System.out.println(round(countNegative, t, 3));
	System.out.println(round(countZero, t, 3));
    }

    private static String round(int num, int divisor, int roundingDecimcalPlaces)
    {
	DecimalFormat df = new DecimalFormat();
	df.setMinimumFractionDigits(roundingDecimcalPlaces);
	return df.format((((double) num) / divisor));
    }
}

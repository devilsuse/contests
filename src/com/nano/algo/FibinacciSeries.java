package com.nano.algo;

/**
 * @author LXMRX
 */
public class FibinacciSeries
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int seriesLength = 20;
		printFiboSeries(seriesLength);
	}

	/**
	 * @param seriesLength
	 */
	public static void printFiboSeries(int seriesLength)
	{
		int start = 1;

		int t1 = 0;
		int t2 = start;
		int temp;
		for (int i = 1; i <= seriesLength; i++)
		{
			System.out.println(t2);
			temp = t1;
			t1 = t2;
			t2 = temp + t2;
		}
	}
}

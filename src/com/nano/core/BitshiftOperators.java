package com.nano.core;

/**
 * @author LXMRX
 */
public class BitshiftOperators
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
	int i = -16;
	System.out
		.println("With Negative number >>> gives DIFFERENT results...........\n");

	System.out.println("i = " + i + ", 2 * i = "
		+ multiplyByPowerOfTwo(i, 1));
	System.out
		.println("i = " + i + ", 2 / i = " + divideByPowerOfTwo(i, 1));
	System.out.println("unSignedRightShiftOperator -> "
		+ unSignedRightShiftOperator(i));

	i = 16;
	System.out
		.println("\nWith Positive number .....................................\n");
	System.out.println("i = " + i + ", 2 * i = "
		+ multiplyByPowerOfTwo(i, 1));
	System.out
		.println("i = " + i + ", 2 / i = " + divideByPowerOfTwo(i, 1));
	System.out.println("unSignedRightShiftOperator -> "
		+ unSignedRightShiftOperator(i));

	i = 1;
	System.out.println("Shift " + i + " right 1 places -> " + (i >> 1));
	System.out.println("Shift " + i + " right 4 places -> " + (i >> 4));
    }

    /**
     * @param num
     * @return int
     */
    public static int unSignedRightShiftOperator(int num)
    {
	return num >>> 1;
    }

    /**
     * @param number
     * @param powerOfTwo
     * @return int
     */
    public static int multiplyByPowerOfTwo(int number, int powerOfTwo)
    {
	return number << powerOfTwo;
    }

    /**
     * @param number
     * @param powerOfTwo
     * @return int
     */
    public static int divideByPowerOfTwo(int number, int powerOfTwo)
    {
	return number >> powerOfTwo;
    }

}

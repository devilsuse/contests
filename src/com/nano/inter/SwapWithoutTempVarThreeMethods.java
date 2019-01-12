package com.nano.inter;

/**
 * @author LXMRX Also works for Strings
 */
public class SwapWithoutTempVarThreeMethods
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// int a = 10, b = 20;
		// System.out.println("IN main ---------");
		// swapBySumSub(a, b);
		// System.out.println("In Main...............After swapBySumSub run: a = "
		// + a + " and b = " + b + "\n");
		// swapByDivMul(a, b);
		// System.out.println("In Main...............After swapByDivMul run: a = "
		// + a + " and b = " + b + "\n");
		// swapByXOR(a, b);
		// String s1 = "abc", s2 = "xyz";
		String s1 = new String("abc");
		String s2 = new String("xyz");
		System.out.println("In main... Before swap: s1 = " + s1 + " s2 = " + s2);
		swapStringWithoutTemp(s1, s2);
		System.out.println("In main... After swap: s1 = " + s1 + " s2 = " + s2);
	}

	/**
	 * @param firstStr
	 * @param secStr
	 */
	public static void swapStringWithoutTemp(String firstStr, String secStr)
	{
		firstStr = firstStr + secStr;
		// secStr = firstStr.substring(0, firstStr.length() - secStr.length());
		secStr.replaceAll(secStr, firstStr.substring(0, firstStr.length() - secStr.length()));
		// firstStr = firstStr.substring(secStr.length());
		firstStr.replaceAll(firstStr, firstStr.substring(secStr.length()));
		System.out.println("After swapBySumSub run: firstStr = " + firstStr + " and secStr = " + secStr);
	}

	/**
	 * @param a
	 * @param b
	 */
	public static void swapBySumSub(int a, int b)
	{
		System.out.println("Before swapBySumSub run: a = " + a + " and b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapBySumSub run: a = " + a + " and b = " + b);
	}

	/**
	 * @param a
	 * @param b
	 */
	public static void swapByDivMul(int a, int b)
	{
		System.out.println("Before swapByDivMul run: a = " + a + " and b = " + b);

		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("After swapByDivMul run: a = " + a + " and b = " + b);
	}

	/**
	 * @param a
	 * @param b
	 */
	public static void swapByXOR(int a, int b)
	{
		System.out.println("Before swapByXOR run: a = " + a + " and b = " + b);

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("After swapByXOR run: a = " + a + " and b = " + b);
	}
}

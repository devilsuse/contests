package com.nano.hacker;

import java.util.Scanner;

/**
 * @author LXMRX
 */
public class MaximizingXOR
{

	/**
	 * Problem Statement
	 * Given two integers: L and R,
	 * find the maximal values of A xor B given, L ≤ A ≤ B ≤ R
	 * Input Format
	 * The input contains two lines, L is present in the first line.
	 * R in the second line.
	 * Constraints
	 * 1 ≤ L ≤ R ≤ 103
	 * Output Format
	 * The maximal value as mentioned in the problem statement.
	 * Sample Input#00
	 * 1
	 * 10
	 * Sample Output#00
	 * 15
	 * Sample Input#01
	 * 10
	 * 15
	 * Sample Output#01
	 * 7
	 * Explanation
	 * In the second sample let's say L=10, R=15, then all pairs which comply to
	 * above condition are
	 * 10⊕10=0
	 * 10⊕11=1
	 * 10⊕12=6
	 * 10⊕13=7
	 * 10⊕14=4
	 * 10⊕15=5
	 * 11⊕11=0
	 * 11⊕12=7
	 * 11⊕13=6
	 * 11⊕14=5
	 * 11⊕15=4
	 * 12⊕12=0
	 * 12⊕13=1
	 * 12⊕14=2
	 * 12⊕15=3
	 * 13⊕13=0
	 * 13⊕14=3
	 * 13⊕15=2
	 * 14⊕14=0
	 * 14⊕15=1
	 * 15⊕15=0
	 * Here two pairs (10,13) and (11,12) have maximum xor value 7 and this is
	 * the answer.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		// System.out.println(convertToBase2(12));
		// System.out.println(convertToBase10("1110"));
		Scanner in = new Scanner(System.in);
		int res;
		int _l;
		_l = Integer.parseInt(in.nextLine());
		int _r;
		_r = Integer.parseInt(in.nextLine());
		res = maxXor(_l, _r);
		System.out.println(res);
		in.close();
	}

	static int maxXor(int l, int r)
	{
		int maxXORValue = 0;
		for (int i = l; i <= r; i++)
		{
			int tempXOR = 0;
			for (int j = i; j <= r; j++)
			{
				tempXOR = doXOR(i, j);

				if (tempXOR > maxXORValue)
					maxXORValue = tempXOR;
			}
		}
		return maxXORValue;
	}

	static int doXOR(int numberOne, int numberTwo)
	{
		String string1 = convertToBase2(numberOne);
		String string2 = convertToBase2(numberTwo);

		int diff = string2.length() - string1.length();
		// As numberTwo will always be passed as greater number, so only first
		// number is padded and no validation is done w.r.t first number.
		if (diff > 0)
			for (int i = diff; i > 0; i--)
				string1 = "0" + string1;
		String XORValue = "";

		for (int i = 0; i < string2.length(); i++)
		{
			if (string1.charAt(i) == string2.charAt(i))
				XORValue += "0";
			else
				XORValue += "1";
		}

		return convertToBase10(XORValue);

	}

	private static int convertToBase10(String base2Number)
	{
		int exponent = 0;
		int decimalNumber = 0;
		for (int i = base2Number.length() - 1; i >= 0; i--)
		{
			decimalNumber += Integer.parseInt(String.valueOf(base2Number.charAt(i))) * (Math.pow(2, exponent));
			exponent++;
		}
		return decimalNumber;
	}

	static String convertToBase2(int decimalNumber)
	{
		String base2Equivalent = "";
		if (decimalNumber < 0)
			return null;

		while (decimalNumber > 0)
		{
			base2Equivalent = String.valueOf((decimalNumber % 2)) + base2Equivalent;
			decimalNumber /= 2;
			if (decimalNumber == 0)
			{
				// base2Equivalent += "0";
				break;
			}
		}

		return base2Equivalent;
	}
}

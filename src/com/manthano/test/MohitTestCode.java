package com.manthano.test;

public class MohitTestCode
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		char ch = '我';
		StringBuffer result = new StringBuffer();

		if ((ch >= 0x20) && (ch < 0x80))
		{
			result.append(ch);
		}
		else
		{
			if (ch <= 0x1F)
			{
				if ((ch == 0xA) || (ch == 0xD))
					result.append("&#" + (int) ch + ";");
				else
				{
					ch += 0xE000;
					result.append("&#" + (int) ch + ";");
				}
			}
			else
			{
				result.append(ch);
			}
		}
		System.out.println("1---> " + result);

		char ch2 = '我';
		StringBuffer result2 = new StringBuffer();

		if ((ch2 >= 0x20) && (ch2 < 0x80))
		{
			result2.append(ch2);
		}
		else if ((ch2 == 0xA) || (ch2 == 0xD))
		{
			// for new line and carriage return character
			result2.append("&#" + (int) ch2 + ";");
		}
		else
		{
			if (ch2 <= 0x1F)
				ch2 += 0xE000;
			result2.append("&#" + (int) ch2 + ";");
		}
		System.out.println("2---> " + result2);

	}
}

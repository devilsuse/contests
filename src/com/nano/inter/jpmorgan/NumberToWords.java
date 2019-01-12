package com.nano.inter.jpmorgan;

import java.text.DecimalFormat;

/**
 * How to convert number to words in java
 * 
 * @author LXMRX
 *
 */
public class NumberToWords
{
    final private static String[] units = { "Zero", "One", "Two", "Three",
	    "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
	    "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
	    "Seventeen", "Eighteen", "Nineteen" };
    final private static String[] tens  = { "", "", "Twenty", "Thirty",
	    "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

    public static String convert(Integer i)
    {
	//
	if (i < 20)
	    return units[i];
	if (i < 100)
	    return tens[i / 10] + ((i % 10 > 0) ? " " + convert(i % 10) : "");
	if (i < 1000)
	    return units[i / 100] + " Hundred"
		    + ((i % 100 > 0) ? " and " + convert(i % 100) : "");
	if (i < 1000000)
	    return convert(i / 1000) + " Thousand "
		    + ((i % 1000 > 0) ? " " + convert(i % 1000) : "");
	return convert(i / 1000000) + " Million "
		+ ((i % 1000000 > 0) ? " " + convert(i % 1000000) : "");
    }

    public static void main(String[] args)
    {
	System.out.println(convert(111));
	System.out.println(convert2(111022));
    }

    // Method 2
    private static final String[] tensNames = { "", " ten", " twenty",
	    " thirty", " forty", " fifty", " sixty", " seventy", " eighty",
	    " ninety"		      };

    private static final String[] numNames  = { "", " one", " two", " three",
	    " four", " five", " six", " seven", " eight", " nine", " ten",
	    " eleven", " twelve", " thirteen", " fourteen", " fifteen",
	    " sixteen", " seventeen", " eighteen", " nineteen" };

    private static String convert2(int number)
    {
	// 0 to 999 999 999 999
	if (number == 0)
	{
	    return "zero";
	}

	String snumber = Long.toString(number);

	// pad with "0"
	String mask = "000000000000";
	DecimalFormat df = new DecimalFormat(mask);
	snumber = df.format(number);

	// XXXnnnnnnnnn
	int billions = Integer.parseInt(snumber.substring(0, 3));
	// nnnXXXnnnnnn
	int millions = Integer.parseInt(snumber.substring(3, 6));
	// nnnnnnXXXnnn
	int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
	// nnnnnnnnnXXX
	int thousands = Integer.parseInt(snumber.substring(9, 12));

	String tradBillions;
	switch (billions)
	{
	case 0:
	    tradBillions = "";
	    break;
	case 1:
	    tradBillions = convertLessThanOneThousand(billions) + " billion ";
	    break;
	default:
	    tradBillions = convertLessThanOneThousand(billions) + " billion ";
	}
	String result = tradBillions;

	String tradMillions;
	switch (millions)
	{
	case 0:
	    tradMillions = "";
	    break;
	case 1:
	    tradMillions = convertLessThanOneThousand(millions) + " million ";
	    break;
	default:
	    tradMillions = convertLessThanOneThousand(millions) + " million ";
	}
	result = result + tradMillions;

	String tradHundredThousands;
	switch (hundredThousands)
	{
	case 0:
	    tradHundredThousands = "";
	    break;
	case 1:
	    tradHundredThousands = "one thousand ";
	    break;
	default:
	    tradHundredThousands = convertLessThanOneThousand(hundredThousands)
		    + " thousand ";
	}
	result = result + tradHundredThousands;

	String tradThousand;
	tradThousand = convertLessThanOneThousand(thousands);
	result = result + tradThousand;

	// remove extra spaces!
	return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
    }

    private static String convertLessThanOneThousand(int number)
    {
	String soFar;

	if (number % 100 < 20)
	{
	    soFar = numNames[number % 100];
	    number /= 100;
	}
	else
	{
	    soFar = numNames[number % 10];
	    number /= 10;

	    soFar = tensNames[number % 10] + soFar;
	    number /= 10;
	}
	if (number == 0)
	    return soFar;
	return numNames[number] + " hundred" + soFar;
    }
}

package com.nano.core.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundDoubles
{

    public static void main(String[] args)
    {
	// http://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places

	// See even though scale is set to 2, this prints only one decimal
	// place. So it is suggested that return the value as String or
	// BigDecimal. See next two sysouts.
	System.out.println(round(50.1, 2));

	System.out.println(roundAndReturnString(50.1, 2));

	System.out.println(roundAndReturnBigDecimal(50.1, 2));

	// prints 50.11
	System.out.println(round(50.114, 2));

	// prints 50.12
	System.out.println(round(50.115, 2));

    }

    public static double round(double value, int places)
    {
	if (places < 0)
	    throw new IllegalArgumentException();

	BigDecimal bd = new BigDecimal(value);
	bd = bd.setScale(places, RoundingMode.HALF_UP);
	return bd.doubleValue();
    }

    public static String roundAndReturnString(double value, int places)
    {
	if (places < 0)
	    throw new IllegalArgumentException();

	BigDecimal bd = new BigDecimal(value);
	bd = bd.setScale(places, RoundingMode.HALF_UP);
	return bd.toString();
    }

    public static BigDecimal roundAndReturnBigDecimal(double value, int places)
    {
	if (places < 0)
	    throw new IllegalArgumentException();

	BigDecimal bd = new BigDecimal(value);
	bd = bd.setScale(places, RoundingMode.HALF_UP);
	return bd;
    }

}

package com.nano.hacker.algo.warmup;

import java.util.Scanner;

public class TimeConversion
{
    private static final String ZERO  = "0";
    private static final String COLON = ":";

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	String line = in.nextLine();

	print24HourFormat(line);
	in.close();
    }

    private static void print24HourFormat(String line)
    {
	String[] arr = line.split(":");
	String amOrpm = arr[2].substring(2);
	String hourString = arr[0];

	// if it is AM just trim AM part
	// If it is PM and hour is 12, just trim PM part
	// e.g 12:12:12PM ==> 12:12:12
	if ((amOrpm.equalsIgnoreCase("AM") && (Integer.parseInt(hourString) != 12))
		|| (amOrpm.equalsIgnoreCase("PM") && (Integer
			.parseInt(hourString) == 12)))
	{
	    System.out.println(line.substring(0, line.length() - 2));
	    return;
	}

	// if method doesn't return from above return stmt, then it is PM
	// format, so add 12 to the hour
	int hour = Integer.parseInt(arr[0]);
	hour += 12;
	if (hour == 24)
	    hour = 0;

	// String hourString = null;
	if (hour == 0)
	    hourString = ZERO + hour;
	else
	    hourString = String.valueOf(hour);

	System.out.println(hourString + COLON + arr[1] + COLON
		+ arr[2].substring(0, 2));
    }
}

package com.nano.core.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class setNonExistentDayOfMonth
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.MONTH, 3);
		calendar.set(Calendar.DATE, 31);// 31-april is non existent so date is
										// wrapped to next day i.e. 1st of May.

		SimpleDateFormat sfd = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sfd.format(calendar.getTime()));

		calendar.set(Calendar.MONTH, 3);
		calendar.set(Calendar.DATE, 32); // date is set to 32, and since
											// getTime() returns long, its
											// converted rightly into 2nd may
		System.out.println(sfd.format(calendar.getTime()));
	}

}

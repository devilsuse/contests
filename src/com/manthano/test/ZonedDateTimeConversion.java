package com.manthano.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeConversion
{
	/*
	 * public static void main(String[] args) { String zdt =
	 * "2021-08-06T19:01:32.632+05:30[Asia/Calcutta]";
	 * 
	 * ZonedDateTime z1 = ZonedDateTime.parse(zdt); ZonedDateTime z2 =
	 * ZonedDateTime.parse(zdt,
	 * DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss zz"));
	 * System.out.println(z2);; }
	 */
	public static void main(String[] args)
	{
		DateTimeFormatter sf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss zz");
		DateTimeFormatter dz = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss z");
		ZonedDateTime z1 = ZonedDateTime.parse("2021-08-06T19:01:32.632+05:30[Asia/Calcutta]");
		System.out.println(con(z1,df));
		
		ZonedDateTime zz = ZonedDateTime.now(ZoneId.of("UTC"));
		//zz.withZoneSameInstant(ZonedDateTime.now().getZone()).format(df);
		ZonedDateTime z2 =	zz.withZoneSameInstant(ZoneId.of("IST",ZoneId.SHORT_IDS));
		System.out.println(z2+" :--zz");
		/*
		 * ZonedDateTime z3 = ZonedDateTime
		 * .parse("2021-08-06T19:01:32.632+05:30[Asia/Calcutta]",
		 * DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss zz"));
		 * 
		 * System.out.println(z3 + ": z3");
		 */
	}
	
	public static ZonedDateTime con(ZonedDateTime z1, DateTimeFormatter df) {
		
		  String s = z1.withZoneSameInstant(ZonedDateTime.now().getZone()).format(df);
		  System.out.println(s + " :con: "); 
		  //return ZonedDateTime.parse(s);
		 
		return z1;
		
		/*
		 * ZonedDateTime zonedDateTime =
		 * ZonedDateTime.parse("2011-12-03T10:15:30+01:00"); ZoneId timeZone =
		 * ZoneId.systemDefault(); ZonedDateTime a =
		 * LocalDateTime.parse("2011-12-03T10:15:30",
		 * DateTimeFormatter.ISO_DATE_TIME).atZone(timeZone);
		 * 
		 * System.out.println(a + " :con: "); ZoneOffset.systemDefault() return a;
		 */
	}
}

package com.nano.core.string;

import com.nano.core.StringLiteralOther;

/**
 * http://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.10.5
 * Example 3.10.5-1. String Literals
 * 
 * @author LXMRX
 *
 */
public class LiteralExpTest
{
    public static void main(String[] args)
    {
	String hello = "Hello", lo = "lo";
	System.out.print((hello == "Hello") + " ");

	System.out.print((StringLiteralOther.hello == hello) + " ");
	System.out.print((SamePackageOther.hello == hello) + " ");

	System.out.print((hello == ("Hel" + "lo")) + " "); // true
	System.out.print((hello == ("Hel" + lo)) + " "); // false

	System.out.println(hello == ("Hel" + lo).intern()); // true
    }

}

class SamePackageOther
{
    static String hello = "Hello";
}
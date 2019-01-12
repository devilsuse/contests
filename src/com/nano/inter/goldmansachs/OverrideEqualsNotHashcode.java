package com.nano.inter.goldmansachs;

import java.util.HashSet;
import java.util.Set;

/**
 * This contains 2 ques 1. size of array 2. method toArray() compiles
 * successfully or comiletime error or runtime excep or compiles and runs
 * without any excep
 * 
 * @author LXMRX
 *
 */
public class OverrideEqualsNotHashcode
{
    private String first, last;

    public OverrideEqualsNotHashcode(String first, String last)
    {
	this.first = first;
	this.last = last;
    }

    @Override
    public boolean equals(Object o)
    {
	OverrideEqualsNotHashcode a = (OverrideEqualsNotHashcode) o;
	return a.first.equals(first) && a.last.equals(last);
    }

    public static void main(String[] args)
    {
	Set table = new HashSet<>();
	OverrideEqualsNotHashcode a = new OverrideEqualsNotHashcode("XXX",
		"YYY");
	OverrideEqualsNotHashcode b = new OverrideEqualsNotHashcode("XXX",
		"YYY");
	OverrideEqualsNotHashcode c = new OverrideEqualsNotHashcode("XXX",
		"YYY");

	table.add(a);
	table.add(b);
	table.add(c);

	if (table.contains(new OverrideEqualsNotHashcode("XXX", "YYY")))
	{
	    table.remove(a);
	}
	System.out.println("size = " + table.size());

	// / This method CALL results in Runtime Exception
	toArray();
    }

    // / This method results in Runtime Exception.
    // But Compiles successfully
    public static void toArray()
    {
	Object[] objects = new Object[10];
	String[] strings = (String[]) objects;

	// String sss = (String)objects;
    }

    public static void castObjectToString()
    {
	Object a = new Object();
	String s = (String) a;

	String str = "ll";
	OverrideEqualsNotHashcode d = (OverrideEqualsNotHashcode) a;
	// OverrideEqualsNotHashcode over = (OverrideEqualsNotHashcode) str;
    }
}

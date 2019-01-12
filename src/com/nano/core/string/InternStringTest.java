package com.nano.core.string;

public class InternStringTest
{
    public static void main(String[] args)
    {
	String s1 = "Test";
	String s2 = "Test";
	String s3 = new String("Test");
	final String s4 = s3.intern();

	System.out.println(s1 == s2);
	System.out.println(s2 == s3);
	System.out.println(s3 == s4);
	System.out.println(s1 == s3);
	System.out.println(s1 == s4);

	System.out.println(s1.equals(s2));
	System.out.println(s2.equals(s3));
	System.out.println(s3.equals(s4));
	System.out.println(s1.equals(s4));
	System.out.println(s1.equals(s3));

	String s11 = "Rakesh";
	String s22 = "Rakesh";
	String s33 = "Rakesh".intern();

	if (s11 == s22)
	{
	    System.out.println("s11 and s22 are same"); // 1.
	}

	if (s11 == s33)
	{
	    System.out.println("s11 and s33 are same"); // 2.
	}
    }

}

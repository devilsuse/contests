package com.nano.core.exception;

public class ReturnValueIn_Try_Finally
{
    public static void main(String[] args)
    {
	System.out.println(returnInCatch("sssss"));
	System.out
		.println("***********************************************************");
	System.out.println(returnInCatch("22"));
	System.out
		.println("***********************************************************");
	System.out.println(justReturn());
    }

    private String getString()
    {
	return "abc";
    }

    private static int returnInCatch(String str)
    {
	try
	{
	    ReturnValueIn_Try_Finally obj = new ReturnValueIn_Try_Finally();
	    System.out.println(obj.getString());
	    int i = Integer.parseInt(str);
	    return 1;
	}
	catch (Exception e)
	{
	    System.out.println("In Exception !");
	    return 2;
	}
	finally
	{
	    System.out.println("Finally Run ....... ");
	    return 3;
	}
    }

    private static int justReturn()
    {
	try
	{
	    return 1;
	}
	catch (Exception e)
	{
	    return 2;
	}
	finally
	{
	    return 3;
	}
	// return 4;
    }

}
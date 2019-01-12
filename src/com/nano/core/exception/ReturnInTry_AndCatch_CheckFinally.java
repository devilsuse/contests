package com.nano.core.exception;

/**
 * So finally runs even in if 1. there is Return in Try or 2. Return in catch
 * 
 * @author LXMRX
 *
 */
public class ReturnInTry_AndCatch_CheckFinally
{
    public static void main(String[] args)
    {
	System.out
		.println("*******************returnInCatch*************************");
	returnInCatch();
	System.out
		.println("*******************returnInTry*************************");
	returnInTry();
    }

    private String getString()
    {
	return "abc";
    }

    private static void returnInCatch()
    {
	try
	{
	    ReturnInTry_AndCatch_CheckFinally obj = new ReturnInTry_AndCatch_CheckFinally();
	    System.out.println(obj.getString());
	    // return;
	    throw new Exception();
	}
	catch (Exception e)
	{
	    System.out.println("In Exception !");
	    return;
	}
	finally
	{
	    System.out.println("Finally Run ....... returnInCatch");
	}
    }

    private static void returnInTry()
    {
	try
	{
	    ReturnInTry_AndCatch_CheckFinally obj = new ReturnInTry_AndCatch_CheckFinally();
	    System.out.println(obj.getString());
	    return;
	}
	catch (Exception e)
	{
	    System.out.println("In Exception !");
	    return;
	}
	finally
	{
	    System.out.println("Finally Run ....... returnInTry");
	}
    }
}

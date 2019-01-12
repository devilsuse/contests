package com.nano.core;

public class FinalizeTest
{
    public void finalize() throws Throwable
    {
	throw new Exception();
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
	System.out.println("All is well......");
	FinalizeTest obj = new FinalizeTest();
	try
	{
	    obj.finalize();
	}
	catch (Throwable e)
	{
	    System.out.println("Exception Caught..........");
	    e.printStackTrace();
	}
    }
}

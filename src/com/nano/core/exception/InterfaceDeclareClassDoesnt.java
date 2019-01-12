package com.nano.core.exception;

public class InterfaceDeclareClassDoesnt implements
	DeclaresMethodWithExceptions
{

    public static void main(String[] args)
    {
	DeclaresMethodWithExceptions a = new InterfaceDeclareClassDoesnt();
	// Accessing Method via Interface type requires Exception to be checked
	// at compile time
	// But if accessed via Class Type, No need to declare/catch any
	// Exception
	try
	{
	    a.fun();
	}
	catch (Exception e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	// if accessed via Class Type, No need to declare/catch any
	// Exception
	InterfaceDeclareClassDoesnt b = new InterfaceDeclareClassDoesnt();
	b.fun();
    }

    // no exception declared or caught
    @Override
    public void fun()
    {
	System.out
		.println("This method neither specifies nor catches Exception....");

    }

}

interface DeclaresMethodWithExceptions
{
    void fun() throws Exception;
}
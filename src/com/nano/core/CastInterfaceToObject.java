package com.nano.core;

public class CastInterfaceToObject implements AnInterface
{
    public static void main(String[] args)
    {
	CastInterfaceToObject a = new CastInterfaceToObject();
	a.castMeToObject();
    }

    public void castMeToObject()
    {
	AnInterface anInterface = new CastInterfaceToObject();
	Object a = (Object) anInterface;

	if (anInterface instanceof Object)
	    System.out.println("TRUE");
	else
	    System.out.println("FALSE");
    }

}

interface AnInterface
{
    void castMeToObject();
}
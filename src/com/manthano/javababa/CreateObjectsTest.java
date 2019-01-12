package com.manthano.javababa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CreateObjectsTest implements Cloneable
{
    public static void main(String[] args)
    {
	// Using new operator
	CreateObjectsTest t1 = new CreateObjectsTest();

	try
	{
	    CreateObjectsTest t2 = CreateObjectsTest.class.newInstance();
	}
	catch (InstantiationException | IllegalAccessException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	try
	{
	    CreateObjectsTest t3 = (CreateObjectsTest) Class
		    .forName("com.manthano.test.Test").newInstance();
	}
	catch (InstantiationException | IllegalAccessException
		| ClassNotFoundException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	try
	{
	    CreateObjectsTest t4 = (CreateObjectsTest) t1.clone();
	}
	catch (CloneNotSupportedException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	try
	{
	    ObjectInputStream in = new ObjectInputStream(
		    new FileInputStream("data.obj"));
	    CreateObjectsTest t5 = (CreateObjectsTest) in.readObject();
	}
	catch (ClassNotFoundException | IOException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }
}
